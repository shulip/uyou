package com.uyou.enumeration;

public enum CandidateDepartmentStatus {
    PASS_QUIZ("已通过问卷"),
    WAIT_FILTER_RESUME("待简历筛选"),
    FAIL_FILTER_RESUME("简历未通过"),
    QUITTED("已放弃面试"),
    WAIT_INTERVIEW("待安排面试"),
    IN_INTERVIEW("面试中"),
    FAILED("挂"),
    PASSED("已通过面试");

    private String text;

    CandidateDepartmentStatus(String text) {
        this.text = text;
    }

    @Override
    public String toString(){
        return text;
    }

    public static CandidateDepartmentStatus fromString(String value) {
        for (CandidateDepartmentStatus status : CandidateDepartmentStatus.values()) {
            if (status.text.equals(value)) {
                return status;
            }
        }
        return null;
    }
}
