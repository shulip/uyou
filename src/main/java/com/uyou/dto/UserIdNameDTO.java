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
public class UserIdNameDTO implements Serializable {
    private Integer id;
    private String name;
}
