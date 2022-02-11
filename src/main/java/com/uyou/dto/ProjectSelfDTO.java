package com.uyou.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author zxwang
 * @createdAt 2022/1/13 20:48
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectSelfDTO implements Serializable {
    private List<ProjectDTO> create;
    private List<ProjectDTO> join;
}
