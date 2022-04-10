package com.uyou.vo;

import com.uyou.domain.TrainTask;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainTaskVO {
    private String processId;
    private String employeeId;
    private String name;
    private int step;

    public TrainTask toTrainTask(){
        TrainTask tt = new TrainTask();
        tt.setProcessId(processId);
        tt.setEmployeeId(employeeId);
        tt.setName(name);
        tt.setStep(step);
        return tt;
    }
}
