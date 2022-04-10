package com.uyou.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FailedMPCandidateVO {
    String cid;
    String reason;
    String name;
}
