package com.maljaaa.commerse.api;

import com.maljaaa.commerse.dto.CreateUserRequest;
import com.maljaaa.commerse.dto.CreateUserResponse;
import com.maljaaa.commerse.model.User;
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

        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPwd(request.getPwd());

        User signUpUser = userService.signUp(user);

        return new CreateUserResponse(signUpUser.getId(), signUpUser.getName(), signUpUser.getEmail(), signUpUser.getPwd());
    }
}
