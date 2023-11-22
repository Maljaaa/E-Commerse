package com.maljaaa.commerse.dto;

import lombok.Data;

import static com.maljaaa.commerse.utils.SuccessMessage.*;

@Data
public class CreateUserResponse {

    private Long id;
    private String message;

    public CreateUserResponse(Long id, String name) {
        this.id = id;
        this.message = name + SIGNUP_OK.getMessage();
    }
}
