package com.uyou.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionVO {

    private Integer id;

    private String title;

    private String type;

    private String inspectType;

    private List<String> options;

}
