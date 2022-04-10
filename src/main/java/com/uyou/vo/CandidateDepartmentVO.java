package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateDepartmentVO {
    private String candidateId;
    private String candidateName;
    private String departmentName;
    private String reason;
}
