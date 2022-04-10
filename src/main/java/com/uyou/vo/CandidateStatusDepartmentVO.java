package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateStatusDepartmentVO {
    private String candidateId;
    private String candidateName;
    private String candidateStatus;
    private String department;
    private String enDepartment;
    private String reason;
}
