package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UploadQuestionVO {

    private Integer id;

    private String title;

    private String type;

    private String inspectType;

    private List<ChoiceVO> options;

    private List<PassLineVO> passLines;

}
