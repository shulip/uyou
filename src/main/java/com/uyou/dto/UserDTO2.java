package com.uyou.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author yjzhang
 * @createdAt 1/16
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO2 implements Serializable {//2表示2个属性
    private Integer id;
    private String name;
}
