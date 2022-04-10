package com.uyou.domain;

import javax.annotation.Generated;
import java.io.Serializable;
import java.time.LocalDateTime;

public class User implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.id")
    private String id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.email")
    private String email;

    private String password;

    private String role;

    private String type;

    private String enrollYear;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String openId;

    private String employeeId;

    private Boolean inCharged;

    private LocalDateTime leaveAt;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getEnrollYear() {
        return enrollYear;
    }

    public void setEnrollYear(String enrollYear) {
        this.enrollYear = enrollYear == null ? null : enrollYear.trim();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public Boolean getInCharged() {
        return inCharged;
    }

    public void setInCharged(Boolean inCharged) {
        this.inCharged = inCharged;
    }

    public LocalDateTime getLeaveAt() {
        return leaveAt;
    }

    public void setLeaveAt(LocalDateTime leaveAt) {
        this.leaveAt = leaveAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append(", role=").append(role);
        sb.append(", type=").append(type);
        sb.append(", enrollYear=").append(enrollYear);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", openId=").append(openId);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", inCharged=").append(inCharged);
        sb.append(", leaveAt=").append(leaveAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
