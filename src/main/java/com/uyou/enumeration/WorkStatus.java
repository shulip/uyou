package com.uyou.enumeration;

public enum WorkStatus {
    IN_PROGRESS("正在进行"),
    FINISHED("结题"),
    CANCELED("取消");


    private String text;

    WorkStatus(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public static WorkStatus fromString(String value) {
        for (WorkStatus status : WorkStatus.values()) {
            if (status.text.equals(value)) {
                return status;
            }
        }
        return null;
    }

}
