package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InterviewFilterVO {
    private String enDepartment;
    private String candidateId;
    private boolean passed;
    private String reason;
}
