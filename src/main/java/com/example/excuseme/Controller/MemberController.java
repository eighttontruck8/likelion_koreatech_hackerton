package com.example.excuseme.Controller;

import com.example.excuseme.Domain.Member;
import com.example.excuseme.Service.MemberService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class MemberController {
    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public void signup(@RequestBody Member member) {

    }
}
