package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserWorkLoadCountVO {
    private String workId;
    private String userId;
    private Double loadCount;
}
