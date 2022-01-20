package com.uyou.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author yjzhang
 * @createdAt 1/17
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserNameTypeDTO implements Serializable {
    private String name;
    private String type;
}
