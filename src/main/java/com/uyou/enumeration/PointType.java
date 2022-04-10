package com.uyou.enumeration;

/**
 * @author ：wangzx
 * @date ：2021/2/5 15:12
 * @description：
 */
public enum PointType {
    ENINEERING("工程"),
    COMPETITION("竞赛"),
    RESEARCH("科研"),
    ALL("总共"),
    PUBLIC("公共"),
    SUPPORT("支撑"),
    MANAGEMENT("管理");

    private String text;

    PointType(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public static PointType fromString(String value) {
        for (PointType status : PointType.values()) {
            if (status.text.equals(value)) {
                return status;
            }
        }
        return null;
    }
}
