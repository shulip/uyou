package com.uyou.enumeration;

/**
 * @author ：wangzx
 * @date ：2021/2/24 16:17
 * @description：
 */
public enum TrainExerciseType {
    //实验,其他
    EXPERIMENR("实验"),
    OTHER("其他");

    private String text;

    TrainExerciseType(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public static TrainExerciseType fromString(String value) {
        for (TrainExerciseType status : TrainExerciseType.values()) {
            if (status.text.equals(value)) {
                return status;
            }
        }
        return null;
    }
}
