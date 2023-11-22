package com.maljaaa.commerse.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CreateUserRequest {

    @NotEmpty
    private String name;

    @NotEmpty
    private String email;

    @NotEmpty
    private String pwd;
}
