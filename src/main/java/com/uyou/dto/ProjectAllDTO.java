package com.uyou.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author yjzhang
 * @createdAt 1/15
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectAllDTO {
    private List<ProjectDTO> allProject;
}
