package com.maljaaa.commerse.dto;

import com.maljaaa.commerse.model.Authority;
import com.maljaaa.commerse.model.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;

import static com.maljaaa.commerse.model.Authority.*;

@Data
@AllArgsConstructor
public class MemberRequestDto {

    private String email;
    private String pwd;

    public Member toMember(PasswordEncoder passwordEncoder) {
        return Member.builder()
                .email(email)
                .pwd(passwordEncoder.encode(pwd))
                .authority(ROLE_USER)
                .build();
    }

    public UsernamePasswordAuthenticationToken toAuthentication() {
        return new UsernamePasswordAuthenticationToken(email, pwd);
    }
}
