package com.uyou.vo;

import com.uyou.domain.PointUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PointUserVO {
    private String userId;
    private String name;
    private String type;
    private int group;
    private double need;
//    private int sum;
    public PointUser toPointUser(){
        PointUser pu = new PointUser();
        pu.setUserId(this.userId);
        pu.setName(this.name);
        pu.setType(this.type);
        pu.setGroup(this.group);
        pu.setNeed(this.need);

        return pu;
    }
}
