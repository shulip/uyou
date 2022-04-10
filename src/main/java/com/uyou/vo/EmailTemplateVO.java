package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailTemplateVO {
    private String irpSubject;
    private String irfSubject;
    private String irpContent;
    private String irfContent;
}
