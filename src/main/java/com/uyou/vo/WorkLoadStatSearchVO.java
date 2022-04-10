package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkLoadStatSearchVO {
    private String workId;
    private String userId;
    private LocalDate fromDate;
    private LocalDate toDate;

    // true: load正序
    // false: load逆序
    private Boolean loadAscOrDesc;
}
