package com.maljaaa.commerce.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
@Table(name = "Member")
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(name = "member_name", length = 20)
    private String name;

    @NotNull
    @Column(name = "member_email", unique = true, length = 30)
    private String email;

    @NotNull
    @Column(name = "member_pwd")
    private String pwd;

    @Enumerated(EnumType.STRING)
    private Authority authority;

    @Builder
    public Member(String email, String pwd, String name, Authority authority) {
        this.email = email;
        this.pwd = pwd;
        this.name = name;
        this.authority = authority;
    }
}
