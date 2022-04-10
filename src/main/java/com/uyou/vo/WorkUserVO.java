package com.uyou.vo;

import com.uyou.domain.WorkUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkUserVO {

    private Integer id;
    private String workId;
    private String userName;
    private String userId;
    private String roleType;
    private LocalDateTime startAt;
    private LocalDateTime endAt;

    public static WorkUserVO WorkUser2WorkUserVO(WorkUser po) {
        if (po == null) return null;
        WorkUserVO vo = new WorkUserVO();
        BeanUtils.copyProperties(po, vo);
        return vo;
    }

}
