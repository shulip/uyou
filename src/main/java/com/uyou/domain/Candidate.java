package com.uyou.domain;

import javax.annotation.Generated;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Candidate implements Serializable {
    private String id;
    private String name;
    private String email;
    private String status;
    private String resumePath;
    private LocalDateTime submittedAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String phone;
    private String university;
    private String school;
    private String major;
    private String applyType;
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
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
    public String getResumePath() {
        return resumePath;
    }
    public void setResumePath(String resumePath) {
        this.resumePath = resumePath == null ? null : resumePath.trim();
    }
    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }
    public void setSubmittedAt(LocalDateTime submittedAt) {
        this.submittedAt = submittedAt;
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
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university) {
        this.university = university == null ? null : university.trim();
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }
    public String getApplyType() {
        return applyType;
    }
    public void setApplyType(String applyType) {
        this.applyType = applyType == null ? null : applyType.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: candidate")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", email=").append(email);
        sb.append(", status=").append(status);
        sb.append(", resumePath=").append(resumePath);
        sb.append(", submittedAt=").append(submittedAt);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", phone=").append(phone);
        sb.append(", university=").append(university);
        sb.append(", school=").append(school);
        sb.append(", major=").append(major);
        sb.append(", applyType=").append(applyType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
