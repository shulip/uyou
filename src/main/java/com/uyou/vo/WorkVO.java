package com.uyou.vo;

import com.uyou.domain.Work;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkVO {
    private String id;
    private String name;
    private String status;
    private String feishuChatId;

    public static WorkVO Work2WorkVO(Work work) {
        if (work == null) return null;
        WorkVO res = new WorkVO();
        BeanUtils.copyProperties(work, res);
        return res;
    }

}
