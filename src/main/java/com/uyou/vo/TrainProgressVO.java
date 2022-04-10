package com.uyou.vo;

import com.uyou.domain.TrainProgress;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainProgressVO {
    private String employeeId;
    private String processId;
    private LocalDate startDate;
    private LocalDate completeDate;
    private String description;
    private String status;

    public TrainProgress toTrainProgress(){
        TrainProgress tp = new TrainProgress();
        tp.setProcessId(this.processId);
        tp.setStartDate(this.startDate);
        tp.setStatus(this.status);
        tp.setDescription(this.description);

        if (this.completeDate !=null){
            tp.setCompleteDate(this.completeDate);
        }
        return tp;
    }
}
