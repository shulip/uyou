package com.uyou.exception;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zxwang
 * @createdAt 2022/1/19 14:42
 * @description
 */
@Data
public class UserExistException extends RuntimeException implements Serializable {
    private int code;

    public UserExistException(String message) {
        super(message);
        code = 500;
    }
}
