package com.uyou.vo;

import com.uyou.domain.WorkLoad;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkLoadVO {

    private Integer id;
    private String workId;
    private String workerId;
    private String managerId;
    private LocalDate weekStartTime;
    private Double loadCount;

    public static WorkLoadVO WorkLoad2WorkLoadVO(WorkLoad po) {
        if (po == null) return null;
        WorkLoadVO vo = new WorkLoadVO();
        BeanUtils.copyProperties(po, vo);
        return vo;
    }

}
