package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkNodeSearchVO {
    private String workId;
    private String nodeName;
    private String nodeType;
    private LocalDateTime createAtFrom;
    private LocalDateTime createAtTo;
    private String status;
}
