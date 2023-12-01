package com.maljaaa.commerse.service;

import com.maljaaa.commerse.dto.signup.CreateUserResponse;
import com.maljaaa.commerse.model.Member;
import com.maljaaa.commerse.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.maljaaa.commerse.utils.ErrorMessage.*;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {

    private final MemberRepository memberRepository;

    /**
     * 회원 가입
     */
    @Transactional
    public CreateUserResponse signUp(Member member) {
        validateDuplicateUser(member);
        memberRepository.save(member);

        return new CreateUserResponse(member.getId(), member.getName());
    }

    private void validateDuplicateUser(Member member) {
        List<Member> findMembers = memberRepository.findByEmail(member.getEmail());

        if(!findMembers.isEmpty()) {
            throw new IllegalStateException(DUPLICATE_EMAIL.getMessage());
        }
    }
}
