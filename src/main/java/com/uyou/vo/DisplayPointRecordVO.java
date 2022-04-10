package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DisplayPointRecordVO {
    private String name;
    private String status;
    //type+need
    private Map<List<String>, Double> needPoints;
    private double sum;
    private List<PointRecordVO> pointRecords;
}
