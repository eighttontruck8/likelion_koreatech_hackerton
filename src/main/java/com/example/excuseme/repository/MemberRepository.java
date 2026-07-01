package com.example.excuseme.repository;

import com.example.excuseme.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class MemberRepository implements JpaRepository<Member, Integer> {

//    // TODO: 이메일 중복체크
//    public boolean existsByEmail(String email) {
//
//        return false;
//    }
//
//    // TODO: 이메일로 ID 체크
//    public boolean findByEmail(String email) {
//        return false;
//        // if email == Member.email
//    }
}
