package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkCVVO {
    String userId;
    List<DisplayWorkUserVO> currentWorks;
    List<DisplayWorkUserVO> completedWorks;

    public WorkCVVO(String userId) {
        this.userId = userId;
    }
}
