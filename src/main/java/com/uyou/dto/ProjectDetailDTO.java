package com.uyou.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author yjzhang
 * @createdAt 1/16
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDetailDTO implements Serializable {
    private Integer id;
    private String name;
    private String description;
    private List<String> gameType;
    private List<ProducerTypeDetailDTO> producerTypes;
}
