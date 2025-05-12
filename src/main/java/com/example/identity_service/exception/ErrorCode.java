package com.example.identity_service.exception;

public enum ErrorCode {
    USER_EXISTED(1001, "User already exists"),
    USER_NOT_EXISTED(1005, "User not exists"),
    USER_NOT_FOUND(1002, "User not found"),
    UNCATEGORIZED(9999, "Uncategorized error"),
    USERNAME_VALIDATION_FAILED(1003, "Username validation failed"),
    PASSWORD_VALIDATION_FAILED(1004, "Password validation failed"),
    UNAUTHENTICATED(1006, "Unauthenticated error"),
    ;
    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
