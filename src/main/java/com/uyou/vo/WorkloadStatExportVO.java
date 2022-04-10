package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkloadStatExportVO {
    private List<WorkLoadStatResultVO> workloads;
    private String title;
}
