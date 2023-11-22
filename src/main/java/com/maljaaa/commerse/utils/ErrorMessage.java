package com.maljaaa.commerse.utils;

public enum ErrorMessage {
    DUPLICATE_EMAIL("[ERROR] 이미 존재하는 회원입니다. 다른 이메일을 입력해주세요."),
    NOT_EMPTY_EMAIL("[ERROR] 이메일은 필수입니다. 이메일을 입력해주세요."),
    NOT_EMPTY_NAME("[ERROR] 이름은 필수입니다. 이름을 입력해주세요."),
    NOT_EMPTY_PWD("[ERROR] 비밀번호는 필수입니다. 비밀번호를 입력해주세요.");

    private String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
