package com.uyou.enumeration;

public enum WorkNodeType {
    INIT("立项"),
    OPEN("开题"),
    MIDDLE("中间"),
    CHECK("验收"),
    END("结题"),
    CONTRACT("合同");


    private String text;

    WorkNodeType(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public static WorkNodeType fromString(String value) {
        for (WorkNodeType status : WorkNodeType.values()) {
            if (status.text.equals(value)) {
                return status;
            }
        }
        return null;
    }

}
