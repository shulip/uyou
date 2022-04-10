package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateDetailVO {
    String id;
    String name;
    String university;
    String applyType;
    String createDate;
    String school;
    String major;
    String email;
    String phone;
    String candidateStatus;
    String departmentName;
    String departmentStatus;
}
