package com.uyou.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author zxwang
 * @createdAt 2022/1/13 20:28
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectCreateDTO implements Serializable {
    private String name;
    private String description;
    private List<String> gameType;
    private List<ProducerTypeDTO> producerTypes;
    private Integer creatorId;
}
