package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PointRecordVO {
    private int id;
//    private int userId;
    private int value;
    private String type;
    private String description;
}
