package com.uyou.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ContinueInterviewVO {
    private String cid;
    private List<Integer> selectedDepartments;
    private boolean agree;
}
