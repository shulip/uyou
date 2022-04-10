package com.uyou.domain;

import javax.annotation.Generated;
import java.io.Serializable;

public class TrainProcess implements Serializable {
    private String id;

    private String trainerEmployeeId;

    private String typeId;

    private Integer step;

    private String name;

    private String method;

    private Integer perdTime;

    private Integer maxTime;

    private Integer taskTime;

    private String password;

    private String inCondition;

    private String outCondition;

    private String skipCondition;

    private String fail;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTrainerEmployeeId() {
        return trainerEmployeeId;
    }

    public void setTrainerEmployeeId(String trainerEmployeeId) {
        this.trainerEmployeeId = trainerEmployeeId == null ? null : trainerEmployeeId.trim();
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public Integer getPerdTime() {
        return perdTime;
    }

    public void setPerdTime(Integer perdTime) {
        this.perdTime = perdTime;
    }

    public Integer getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(Integer maxTime) {
        this.maxTime = maxTime;
    }

    public Integer getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(Integer taskTime) {
        this.taskTime = taskTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getInCondition() {
        return inCondition;
    }

    public void setInCondition(String inCondition) {
        this.inCondition = inCondition == null ? null : inCondition.trim();
    }

    public String getOutCondition() {
        return outCondition;
    }

    public void setOutCondition(String outCondition) {
        this.outCondition = outCondition == null ? null : outCondition.trim();
    }

    public String getSkipCondition() {
        return skipCondition;
    }

    public void setSkipCondition(String skipCondition) {
        this.skipCondition = skipCondition == null ? null : skipCondition.trim();
    }

    public String getFail() {
        return fail;
    }

    public void setFail(String fail) {
        this.fail = fail == null ? null : fail.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", trainerEmployeeId=").append(trainerEmployeeId);
        sb.append(", typeId=").append(typeId);
        sb.append(", step=").append(step);
        sb.append(", name=").append(name);
        sb.append(", method=").append(method);
        sb.append(", perdTime=").append(perdTime);
        sb.append(", maxTime=").append(maxTime);
        sb.append(", taskTime=").append(taskTime);
        sb.append(", password=").append(password);
        sb.append(", inCondition=").append(inCondition);
        sb.append(", outCondition=").append(outCondition);
        sb.append(", skipCondition=").append(skipCondition);
        sb.append(", fail=").append(fail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
