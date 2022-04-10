package com.uyou.exception;

import lombok.Data;

@Data
public class UserException extends RuntimeException {
    private int code;

    public UserException(String s, int code) {
        super(s);
        this.code = code;
    }
}
