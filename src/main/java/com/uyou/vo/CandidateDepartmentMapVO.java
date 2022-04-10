package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateDepartmentMapVO {
    private String candidateId;
    private String candidateName;
    private Map<String, String> departmentsWithReasons;
}
