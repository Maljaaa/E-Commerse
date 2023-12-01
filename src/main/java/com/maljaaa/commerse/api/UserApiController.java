package com.maljaaa.commerse.api;

import com.maljaaa.commerse.dto.signup.CreateUserRequest;
import com.maljaaa.commerse.dto.signup.CreateUserResponse;
import com.maljaaa.commerse.model.Member;
import com.maljaaa.commerse.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserApiController {

    private final UserService userService;

    /**
     * 회원 가입
     */
    @PostMapping("/api/signup")
    public CreateUserResponse saveUser(@RequestBody @Valid CreateUserRequest request) {

        Member member = new Member();
        member.setName(request.getName());
        member.setEmail(request.getEmail());
        member.setPwd(request.getPwd());

        return userService.signUp(member);
    }

    /**
     * 로그인
     */

}
