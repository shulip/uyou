package com.uyou.enumeration;

public enum WorkNodeStatus {
    FINISHED_ON_TIME("按时完成"),
    FINISHED_OVERDUE("逾期完成"),
    UNFINISHED_OVERDUE("逾期未完成");


    private String text;

    WorkNodeStatus(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public static WorkNodeStatus fromString(String value) {
        for (WorkNodeStatus status : WorkNodeStatus.values()) {
            if (status.text.equals(value)) {
                return status;
            }
        }
        return null;
    }

}
