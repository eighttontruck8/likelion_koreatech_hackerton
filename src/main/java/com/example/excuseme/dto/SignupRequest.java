package com.example.excuseme.dto;

public record SignupRequest(
    String email,
    String pw,
    String nickname) {
}
