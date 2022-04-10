package com.uyou.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InterviewCommentVO {
    private int interviewId;
    private String interviewerId;
    private boolean result;
    private String comment;
    private String interviewerName;
    private String departmentName;
    private boolean isParticipated;
}
