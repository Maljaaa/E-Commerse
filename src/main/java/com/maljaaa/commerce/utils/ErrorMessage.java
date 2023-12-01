package com.maljaaa.commerce.utils;

public enum ErrorMessage {
    DUPLICATE_EMAIL("[ERROR] 이미 존재하는 회원입니다. 다른 이메일을 입력해주세요."),
    NOT_EMPTY_EMAIL("[ERROR] 이메일은 필수입니다. 이메일을 입력해주세요."),
    NOT_EMPTY_NAME("[ERROR] 이름은 필수입니다. 이름을 입력해주세요."),
    NOT_EMPTY_PWD("[ERROR] 비밀번호는 필수입니다. 비밀번호를 입력해주세요."),
    VALIDATE_RF("[ERROR] Refresh Token이 유효하지 않습니다."),
    LOGOUT_USER("[ERROR] 로그아웃된 사용자입니다."),
    TOKEN_ERROR("[ERROR] 토큰의 유저 정보가 일치하지 않습니다."),
    DB_ERROR(" -> DB에서 찾을 수 없습니다."),
    VALIDATE_CLAIMS("권한 정보가 없는 토큰입니다."),
    JWT_EXCEPTION("잘못된 JWT 서명입니다."),
    JWT_EXPIRED("만료된 JWT 토큰입니다."),
    JWT_UNSUPPORTED("지원되지 않는 JWT 토큰입니다."),
    JWT_ILLEGALARGUMENT("JWT 토큰이 잘못되었습니다.");

    private String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
