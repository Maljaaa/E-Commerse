package com.maljaaa.commerse.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "User")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_name", length = 20)
    private String name;

    @NotNull
    @Column(name = "user_email", unique = true, length = 30)
    private String email;

    @NotNull
    @Column(name = "user_pwd")
    private String pwd;
}
