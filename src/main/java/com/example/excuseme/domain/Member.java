package com.example.excuseme.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB: auto-increment 사용
    private Long id;

    //TODO: 중복 불가 설정 (UNIQUE), NULLABLE=FALSE
    private String email;
    private String password;
    private String nickname;

    //TODO: OAUTH 추가 시 provider, providerId 생성 필요

    protected Member() {}
    public Member(String email, String password, String nickname) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
    }
}
