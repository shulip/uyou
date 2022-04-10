package com.uyou.enumeration;

/**
 * @author Aneureka
 * @description 问题类型
 * @createdAt 2019-07-03 21:08
 **/
public enum QuestionType {

    MULTIPLE_CHOICE("单选题"),
    MULTIPLE_ANSWERS("多选题"),
    TIME_PICK_ANSWER("时间选择题"),
    SHORT_ANSWER("填空题");

    private String text;

    QuestionType(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }

    public static QuestionType fromString(String type) {
        for (QuestionType qt: QuestionType.values()) {
            if (qt.text.equals(type)) {
                return qt;
            }
        }
        return null;
    }
}
