package com.uyou.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class IntervieweeVO {
    private String candidateId;
    private String name;
    private Integer interviewId;
    private String departmentName;
}
