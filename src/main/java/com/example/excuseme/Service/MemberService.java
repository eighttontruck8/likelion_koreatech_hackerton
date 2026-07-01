package com.example.excuseme.Service;

import com.example.excuseme.Domain.Member;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    // TODO: 회원가입
    public void signup(Member member) {
        // 1. 회원가입 요청 받기

        // TODO: 이메일 중복 체크
        // TODO: 이메일 정보 존재할 경우 예외
        // 2. MEMBER 엔티티 생성

        // 3. 엔티티 저장
        // TODO: 이후 DB 저장으로 변경
        // TODO: 이후 PW 암호화 적용

        // 4. 응답 DTO 반환
    }

}
