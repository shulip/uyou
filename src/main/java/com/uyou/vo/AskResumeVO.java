package com.uyou.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class AskResumeVO {
    //candidate id
    private String cid;
    //candidate name
    private String name;
    //deadline for submitting resume
    private LocalDateTime ddl;
}
