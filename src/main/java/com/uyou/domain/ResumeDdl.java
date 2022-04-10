package com.uyou.domain;

import javax.annotation.Generated;
import java.io.Serializable;
import java.time.LocalDateTime;

public class ResumeDdl implements Serializable {
    private Integer id;

    private String candidateId;

    private LocalDateTime ddl;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId == null ? null : candidateId.trim();
    }

    public LocalDateTime getDdl() {
        return ddl;
    }

    public void setDdl(LocalDateTime ddl) {
        this.ddl = ddl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", candidateId=").append(candidateId);
        sb.append(", ddl=").append(ddl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
