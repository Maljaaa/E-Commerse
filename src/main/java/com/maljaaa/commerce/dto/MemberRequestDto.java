package com.maljaaa.commerce.dto;

import com.maljaaa.commerce.model.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;

import static com.maljaaa.commerce.model.Authority.*;

@Data
@AllArgsConstructor
public class MemberRequestDto {

    private String email;
    private String pwd;
    private String name;

    public Member toMember(PasswordEncoder passwordEncoder) {
        return Member.builder()
                .email(email)
                .pwd(passwordEncoder.encode(pwd))
                .name(name)
                .authority(ROLE_USER)
                .build();
    }

    public UsernamePasswordAuthenticationToken toAuthentication() {
        return new UsernamePasswordAuthenticationToken(email, pwd);
    }
}
