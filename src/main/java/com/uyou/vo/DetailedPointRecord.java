package com.uyou.vo;

import com.uyou.domain.PointRecord;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailedPointRecord {
    private String userId;
    private String workId;
//    private Boolean isPublic;
    private String type;
    private double value;
    private String description;

    public PointRecord toPointRecord(){
        PointRecord pr = new PointRecord();

        pr.setUserId(this.userId);
        pr.setWorkId(this.workId);
//        pr.setIsPublic(this.isPublic);
        pr.setType(this.type);
        pr.setValue(this.value);
        pr.setDescription(this.description);

        return pr;
    }
}
