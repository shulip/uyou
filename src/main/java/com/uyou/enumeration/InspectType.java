package com.uyou.enumeration;

/**
 * @author Aneureka
 * @description 考察类型
 * @createdAt 2019-07-05 10:27
 **/
public enum InspectType {

    BACKGROUND("基础信息"),
    PROFESSIONAL("专业背景"),
    COMMON("行为测试");

    private String text;

    InspectType(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }

    public static InspectType fromString(String text) {
        for (InspectType it: InspectType.values()) {
            if (it.text.equals(text)) {
                return it;
            }
        }
        return null;
    }
}
