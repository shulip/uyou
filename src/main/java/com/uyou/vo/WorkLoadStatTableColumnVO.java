package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkLoadStatTableColumnVO {
    private String id;
    private String name;
    private Double totWorkLoad;
    private Integer workingDays;
    private Integer vacationDays;
    private Integer trainingDays;
    private Double averageWorkLoad;
    private List<Double> workLoadDetails;
}
