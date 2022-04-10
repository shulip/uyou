package com.uyou.enumeration;

public enum ApplyType {
    SUMMER_CAMP("夏令营"),
    OTHER("其他");

    private String text;

    ApplyType(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public static ApplyType fromString(String value) {
        for (ApplyType status : ApplyType.values()) {
            if (status.text.equals(value)) {
                return status;
            }
        }
        return null;
    }
}
