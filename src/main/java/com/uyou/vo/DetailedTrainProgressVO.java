package com.uyou.vo;

import com.uyou.domain.TrainProgress;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailedTrainProgressVO {
    private String processId;
    private String typeId;
    private int step;
    private LocalDate startDate;
    private LocalDate completeDate;
    private LocalDate predCompleteDate;
    private LocalDate maxCompleteDate;
    private Integer totalTime;
    private String description;
    private String status;

    public DetailedTrainProgressVO(TrainProgress trainProgress){
        this.processId = trainProgress.getProcessId();
        this.startDate = trainProgress.getStartDate();
        this.status = trainProgress.getStatus();
        this.completeDate = trainProgress.getCompleteDate();
        this.predCompleteDate = trainProgress.getPredEndDate();
        this.maxCompleteDate = trainProgress.getMaxEndDate();
    }

    public TrainProgress toTrainProgress(){
        TrainProgress tp = new TrainProgress();
        tp.setProcessId(this.processId);
        tp.setStartDate(this.startDate);
        tp.setStatus(this.status);
        tp.setDescription(this.description);
        return tp;
    }
}
