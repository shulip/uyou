package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashMap;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DisplayCandidateDetailVO {
    String id;
    String name;
    String university;
    String school;
    String major;
    String email;
    String phone;
    String applyType;
    String createDate;
    String candidateStatus;
    LinkedHashMap<String, String> departmentStatus;
}
