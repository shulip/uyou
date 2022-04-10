package com.uyou.enumeration;

public enum CandidateStatus {
    NEW("未完成问卷"),
    FAILED_QUIZ("未通过问卷"),
    PASS_QUIZ("已通过问卷"),
    QUIT("已放弃"),
    QUIT_INTERVIEW("已放弃面试"),
    QUIT_RESUME("已放弃发送简历"),
    QUIT_POSITION("已放弃选择方向"),
    SLEEP("休眠"),
    WAITING_TECH_INT("待技术面试"),
    TECH_INT("技术面试中"),
    WAITING_SYN_INT("待综合面试"),
    SYN_INT("综合面试中"),
    FINAL_CONFIRM("待最终确认"),
    FAILED("未通过"),
    FAILED_INFORMED("未通过已通知"),
    PASSED("通过"),
    PASSED_INFORMED("通过已通知"),
    OFFER_REJECTED("已放弃 OFFER"),
    OFFER_ACCEPTED("已接受 OFFER"),
    OFFER_INVALID_BECAUSE_OF_SCHOOL("未被学院录取"),
    OFFER_INVALID_BECAUSE_OF_CANDIDATE("被学院录取了，但毁约"),
    OFFER_ACCEPTED_BUT_CANCELED_LATER("接受 OFFER 后，被取消 OFFER"),
    ADMITTED_IN("已进组"),
    OUT_OF_GROUP("已离组");


    private String text;

    CandidateStatus(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public static CandidateStatus fromString(String value) {
        for (CandidateStatus status : CandidateStatus.values()) {
            if (status.text.equals(value)) {
                return status;
            }
        }
        return null;
    }

}
