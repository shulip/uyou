package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DisplayWorkLoadVO {

    private Integer id;

    private String workId;
    private String workName;

    private String workerId;
    private String workerName;

    private String managerId;
    private String managerName;

    private LocalDate weekStartTime;
    private Double loadCount;

}
