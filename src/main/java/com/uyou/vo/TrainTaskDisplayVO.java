package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainTaskDisplayVO {
    private int id;
    private String employeeId;
    private String directorName;
    private String prcessId;
    private String typeId;
    private int processStep;
    private String name;
    private int step;
}
