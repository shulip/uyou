package com.uyou.enumeration;

/**
 * 项目成员类型
 */
public enum WorkUserRoleType {
    INNER_MEMBER("内部"),
    MANAGER("负责人");


    private String text;

    WorkUserRoleType(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public static WorkUserRoleType fromString(String value) {
        for (WorkUserRoleType status : WorkUserRoleType.values()) {
            if (status.text.equals(value)) {
                return status;
            }
        }
        return null;
    }

}
