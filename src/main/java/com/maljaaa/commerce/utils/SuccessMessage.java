package com.maljaaa.commerce.utils;

public enum SuccessMessage {
    SIGNUP_OK("님이 회원가입에 성공했습니다!");

    private String message;

    SuccessMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
