package com.example.excuseme.Domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Member {
    private int id;
    private String email;
    private String password;
    private String nickname;
    private String role;

    public Member(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }
}
