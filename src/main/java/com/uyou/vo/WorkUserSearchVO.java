package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkUserSearchVO {
    private Integer id;
    private String workId;
    private String userId;
    private String roleType;

    private Boolean inWork;

    private LocalDateTime startTimeFrom;
    private LocalDateTime startTimeTo;
    private LocalDateTime endTimeFrom;
    private LocalDateTime endTimeTo;
}
