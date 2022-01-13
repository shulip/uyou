package com.uyou.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zxwang
 * @createdAt 2022/1/13 20:37
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProducerTypeDTO implements Serializable {
    private String producerType;
    private Integer neededNumber;
}
