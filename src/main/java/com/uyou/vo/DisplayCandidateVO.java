package com.uyou.vo;

import com.uyou.domain.Candidate;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DisplayCandidateVO {
    private String id;
    private String name;
    private LocalDateTime submittedAt;

    public DisplayCandidateVO(String id, String name, LocalDateTime submittedAt) {
        this.id = id;
        this.name = name;
        this.submittedAt = submittedAt;
    }

    public static DisplayCandidateVO fromCandidate(Candidate candidate) {
        return new DisplayCandidateVO(candidate.getId(), candidate.getName(), candidate.getSubmittedAt());
    }
}
