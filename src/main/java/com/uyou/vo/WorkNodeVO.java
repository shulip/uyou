package com.uyou.vo;

import com.uyou.domain.WorkNode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkNodeVO {
    private Integer id;
    private String workId;
    private String nodeName;
    private String nodeType;
    private LocalDateTime createAt;
    private String status;
    private String unfinishedStuff;

    public static WorkNode workNodeVO2WorkNodePO(WorkNodeVO vo) {
        WorkNode po = new WorkNode();
        BeanUtils.copyProperties(vo, po);
        return po;
    }

    public static WorkNodeVO workNodePO2WorkNodeVO(WorkNode po) {
        WorkNodeVO vo = new WorkNodeVO();
        BeanUtils.copyProperties(po, vo);
        return vo;
    }


}
