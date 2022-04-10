package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DisplayTrainProgressDetailedVO {
    private String name;
    private LocalDate startTime;
    private List<DetailedTrainProgressVO> progresses;
}
