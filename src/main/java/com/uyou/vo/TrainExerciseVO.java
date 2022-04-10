package com.uyou.vo;

import com.uyou.domain.TrainExercise;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainExerciseVO {
    private String type;
    private String description;
    private int degree;
    private int taskId;

    public TrainExercise toTrainExercise(){
        TrainExercise te = new TrainExercise();
        te.setType(type);
        te.setDescription(description);
        te.setDegree(degree);
        te.setTaskId(taskId);

        return te;
    }
}
