package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkLoadStatResultVO {
    private String userId;
    private String userName;
    private Double workLoad;
}
