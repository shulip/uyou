package com.uyou.domain;

import javax.annotation.Generated;
import java.io.Serializable;
import java.time.LocalDate;

public class TrainProgress implements Serializable {
    private Integer id;

    private Integer userId;

    private String processId;

    private Integer taskStep;

    private LocalDate startDate;

    private LocalDate completeDate;

    private LocalDate predEndDate;

    private LocalDate maxEndDate;

    private String description;

    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId == null ? null : processId.trim();
    }

    public Integer getTaskStep() {
        return taskStep;
    }

    public void setTaskStep(Integer taskStep) {
        this.taskStep = taskStep;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(LocalDate completeDate) {
        this.completeDate = completeDate;
    }

    public LocalDate getPredEndDate() {
        return predEndDate;
    }

    public void setPredEndDate(LocalDate predEndDate) {
        this.predEndDate = predEndDate;
    }

    public LocalDate getMaxEndDate() {
        return maxEndDate;
    }

    public void setMaxEndDate(LocalDate maxEndDate) {
        this.maxEndDate = maxEndDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", processId=").append(processId);
        sb.append(", taskStep=").append(taskStep);
        sb.append(", startDate=").append(startDate);
        sb.append(", completeDate=").append(completeDate);
        sb.append(", predEndDate=").append(predEndDate);
        sb.append(", maxEndDate=").append(maxEndDate);
        sb.append(", description=").append(description);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
