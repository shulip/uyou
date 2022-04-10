package com.uyou.vo;

import com.uyou.domain.Interview;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InterviewVO {

    private String candidateId;
    //department en_name
    private String enDepartment;
    private LocalDateTime beginAt;
    private LocalDateTime endAt;
    //interviewers' id list
    private List<String> interviewers;

    public Interview toInterview() {
        Interview interview = new Interview();
        interview.setCandidateId(candidateId);
        interview.setBeginAt(beginAt);
        interview.setEndAt(endAt);
        return interview;
    }
}
