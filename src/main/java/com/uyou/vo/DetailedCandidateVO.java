package com.uyou.vo;

import com.uyou.domain.Candidate;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class DetailedCandidateVO {
    private String id;
    private String name;
    private String email;
    private String status;
    private String resumePath;
    private LocalDateTime submittedAt;
    private List<QuestionAnswerVO> answers;

    public DetailedCandidateVO(Candidate candidate, List<QuestionAnswerVO> answers) {
        this.id = candidate.getId();
        this.name = candidate.getName();
        this.email = candidate.getEmail();
        this.status = candidate.getStatus();
        this.resumePath = candidate.getResumePath();
        this.submittedAt = candidate.getSubmittedAt();
        this.answers = answers;
    }

    public Candidate toCandidate() {
        Candidate candidate = new Candidate();
        candidate.setId(id);
        candidate.setName(name);
        candidate.setEmail(email);
        candidate.setStatus(status);
        candidate.setResumePath(resumePath);
        candidate.setSubmittedAt(submittedAt);
        return candidate;
    }
}
