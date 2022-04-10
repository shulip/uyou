package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DisplayTrainProgressVO {
    private String typeId;
    private int step;
    private LocalDate startDate;
    private LocalDate endDate;
    private String employeeId;
}
