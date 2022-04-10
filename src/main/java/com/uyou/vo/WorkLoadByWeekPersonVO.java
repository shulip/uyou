package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkLoadByWeekPersonVO {

    private LocalDate week;
    private String workerId;
    private Double workLoad;

}
