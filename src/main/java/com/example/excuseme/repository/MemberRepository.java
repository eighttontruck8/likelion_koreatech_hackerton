package com.example.excuseme.repository;

import com.example.excuseme.domain.Member;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    public static void main(String[] args) {
        MemberRepository memberRepository = new MemberRepository();
    }

    public void save(Member member) {

    }

    public void delete(Member member) {

    }

    // TODO: 이메일 중복체크
    public boolean existsByEmail(String email) {

        return false;
    }

    // TODO: 이메일로 ID 체크
    public boolean findByEmail(String email) {
        return false;
        // if email == Member.email
    }
}
