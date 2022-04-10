package com.uyou.vo;

import com.uyou.domain.TrainProcess;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainProcessVO {
    private String trainerEmployeeId;
    private String typeId;
    private int step;
    private String name;
    private String method;
    private String inCondition;
    private String outCondition;
    private String skipCondition;
    private int predTime;
    private int maxTime;
    private int taskTime;
    private String fail;
    private String password;

    public TrainProcess toTrainProcess(){
        TrainProcess tp = new TrainProcess();
        tp.setId(UUID.randomUUID().toString());
        tp.setTrainerEmployeeId(trainerEmployeeId);
        tp.setTypeId(typeId);
        tp.setStep(step);
        tp.setName(name);
        tp.setMethod(method);
        tp.setInCondition(inCondition);
        tp.setOutCondition(outCondition);
        tp.setSkipCondition(skipCondition);
        tp.setPerdTime(predTime);
        tp.setMaxTime(maxTime);
        tp.setTaskTime(taskTime);
        tp.setFail(fail);
        tp.setPassword(password);
        return tp;
    }
}
