package com.uyou.domain;

import javax.annotation.Generated;
import java.io.Serializable;
import java.time.LocalDate;

public class WorkLoad implements Serializable {
    private Integer id;

    private String workId;

    private String workerId;

    private String managerId;

    private LocalDate weekStartTime;

    private Double loadCount;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId == null ? null : workId.trim();
    }

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId == null ? null : workerId.trim();
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId == null ? null : managerId.trim();
    }

    public LocalDate getWeekStartTime() {
        return weekStartTime;
    }

    public void setWeekStartTime(LocalDate weekStartTime) {
        this.weekStartTime = weekStartTime;
    }

    public Double getLoadCount() {
        return loadCount;
    }

    public void setLoadCount(Double loadCount) {
        this.loadCount = loadCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", workId=").append(workId);
        sb.append(", workerId=").append(workerId);
        sb.append(", managerId=").append(managerId);
        sb.append(", weekStartTime=").append(weekStartTime);
        sb.append(", loadCount=").append(loadCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
