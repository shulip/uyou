package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DisplayWorkUserVO {
    private Integer id;

    private String workId;
    private String workName;

    private String userId;
    private String userName;

    private LocalDateTime startAt;
    private LocalDateTime endAt;

    private Double loadCount;
}
