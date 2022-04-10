package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkLoadStatTableVO {
    private List<LocalDate> dateWeeks;                  // 统计表包含的weeks列表
    private List<Integer> workingPersonalCount;         // 每周工作人数表
    private List<Double> averageWorkLoad;               // 每周平均工作量
    private List<WorkLoadStatTableColumnVO> details;    // 细节信息 * weeks
}
