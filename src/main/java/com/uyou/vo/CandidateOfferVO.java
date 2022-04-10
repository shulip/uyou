package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateOfferVO {
    String id;
    String name;
    String university;
    String major;
    String email;
    String phone;
    String applyType;
    String status;
    String createdAt;
    String updatedAt;
}
