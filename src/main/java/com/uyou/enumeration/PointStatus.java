package com.uyou.enumeration;

/**
 * @author ：wangzx
 * @date ：2021/2/5 15:15
 * @description：
 */
public enum PointStatus {
    COMPLETED("完成"),
    UNCOMPLETED("未完成");

    private String text;

    PointStatus(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public static PointStatus fromString(String value) {
        for (PointStatus status : PointStatus.values()) {
            if (status.text.equals(value)) {
                return status;
            }
        }
        return null;
    }
}
