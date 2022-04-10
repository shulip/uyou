package com.uyou.enumeration;

/**
 * @author zxwang
 * @createdAt 2020-02-03 21:04
 * @description 训练类型
 **/
public enum TrainStatus {
    // 进行，结束，中止
    CONDUCT("进行"),
    COMPLETED("结束"),
    SUSPEND("中止"),
    WAIT("等待");


    private String text;

    TrainStatus(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public static TrainStatus fromString(String value) {
        for (TrainStatus status : TrainStatus.values()) {
            if (status.text.equals(value)) {
                return status;
            }
        }
        return null;
    }
}
