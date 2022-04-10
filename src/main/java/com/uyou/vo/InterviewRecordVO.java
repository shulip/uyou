package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InterviewRecordVO {
    private DisplayCandidateVO candidate;
    private List<InterviewCommentVO> techIntComments;
    private List<InterviewCommentVO> synIntComments;
}
