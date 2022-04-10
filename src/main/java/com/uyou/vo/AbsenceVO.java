package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AbsenceVO {
    private DisplayUserVO user;
    private List<Integer> absenceDaysList;
}
