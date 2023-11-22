package com.maljaaa.commerse.dto;

import lombok.Data;

@Data
public class CreateUserResponse {

    private Long id;
    private String name;
    private String email;
    private String pwd;

    public CreateUserResponse(Long id, String name, String email, String pwd) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pwd = pwd;
    }
}
