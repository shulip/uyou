package com.uyou.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zxwang
 * @createdAt 2022/1/12 14:04
 * @description
 */
@Data
public class ResultWrapper implements Serializable {
    /**
     * 200为正常，其余为异常
     */
    private Integer code;
    private String msg;
    private Object data;

    public ResultWrapper(Integer code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    /**
     * 正常情况下带有数据的返回结果
     * @param data 传入的数据
     */
    public ResultWrapper(Object data) {
        this(200, data, "");
    }

    /**
     * 正常情况下仅返回成功状态
     */
    public ResultWrapper() {
        this(200, null, "");
    }

    /**
     * 异常情况下，返回错误信息
     * @param code 错误代码
     * @param msg 错误信息
     */
    public ResultWrapper(Integer code, String msg) {
        this(code, null, msg);
    }

}

