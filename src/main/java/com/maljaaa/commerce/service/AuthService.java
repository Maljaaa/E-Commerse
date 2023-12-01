package com.maljaaa.commerce.service;

import com.maljaaa.commerce.dto.MemberRequestDto;
import com.maljaaa.commerce.dto.MemberResponseDto;
import com.maljaaa.commerce.dto.TokenDto;
import com.maljaaa.commerce.dto.TokenRequestDto;
import com.maljaaa.commerce.jwt.TokenProvider;
import com.maljaaa.commerce.model.Member;
import com.maljaaa.commerce.model.jwt.RefreshToken;
import com.maljaaa.commerce.repository.MemberRepository;
import com.maljaaa.commerce.repository.jwt.RefreshTokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.maljaaa.commerce.utils.ErrorMessage.*;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthenticationManagerBuilder authenticationManagerBuilder;
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;
    private final TokenProvider tokenProvider;
    private final RefreshTokenRepository refreshTokenRepository;

    @Transactional
    public MemberResponseDto signup(MemberRequestDto memberRequestDto) {
        validateDuplicatedEmail(memberRequestDto);
        Member member = memberRequestDto.toMember(passwordEncoder);

        return MemberResponseDto.of(memberRepository.save(member));
    }

    private void validateDuplicatedEmail(MemberRequestDto memberRequestDto) {
        if (memberRepository.existsByEmail(memberRequestDto.getEmail())) {
            throw new RuntimeException(DUPLICATE_EMAIL.getMessage());
        }
    }

    @Transactional
    public TokenDto login(MemberRequestDto memberRequestDto) {
        // 1. Login id/pwd를 기반으로 AuthenticationToken 생성
        UsernamePasswordAuthenticationToken authenticationToken = memberRequestDto.toAuthentication();

        // 2. 실제로 검증이 이루어짐(사용자 비밀번호 체크)
        // authenticate 매서드가 실행이 될 때 CustomUserDetailService에서 만들었던 loadUserByUsername 매서드 실행
        Authentication authentication = authenticationManagerBuilder.getObject()
                .authenticate(authenticationToken);

        // 3. 인증 정보를 기반으로 JWT 생성
        TokenDto tokenDto = tokenProvider.generateTokenDto(authentication);

        // 4. RefreshToken 저장
        RefreshToken refreshToken = RefreshToken.builder()
                .key(authentication.getName())
                .value(tokenDto.getRefreshToken())
                .build();

        refreshTokenRepository.save(refreshToken);

        // 5. 토큰 발급
        return tokenDto;
    }

    @Transactional
    public TokenDto reissue(TokenRequestDto tokenRequestDto) {
        // 1. RefreshToekn 검증
        validateRefreshToken(tokenRequestDto);

        // 2. AccessToken에서 Member ID 가져오기
        Authentication authentication = tokenProvider.getAuthentication(tokenRequestDto.getAccessToken());

        // 3. 저장소에서 ID를 기반으로 RF 값 가져옴
        RefreshToken refreshToken = refreshTokenRepository.findByKey(authentication.getName())
                .orElseThrow(() -> new RuntimeException(LOGOUT_USER.getMessage()));

        // 4. RF 일치하는지 검사
        validateUserInfoInToken(tokenRequestDto, refreshToken);

        // 5. 새로운 토큰 생성
        TokenDto tokenDto = tokenProvider.generateTokenDto(authentication);

        // 6. 저장소 정보 업데이트
        RefreshToken newRefreshToken = refreshToken.updateValue(tokenDto.getRefreshToken());
        refreshTokenRepository.save(newRefreshToken);

        // 토큰 발급
        return tokenDto;
    }

    private void validateRefreshToken(TokenRequestDto tokenRequestDto) {
        if (!tokenProvider.validateToken(tokenRequestDto.getRefreshToken())) {
            throw new RuntimeException(VALIDATE_RF.getMessage());
        }
    }

    private void validateUserInfoInToken(TokenRequestDto tokenRequestDto, RefreshToken refreshToken) {
        if (!refreshToken.getValue().equals(tokenRequestDto.getRefreshToken())) {
            throw new RuntimeException(TOKEN_ERROR.getMessage());
        }
    }
}


