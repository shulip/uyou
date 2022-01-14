package com.uyou.dto;

import com.uyou.entity.Project;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author zxwang
 * @createdAt 2022/1/13 20:44
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDTO implements Serializable {
    private Integer id;
    private String name;
    private String description;
    private List<String> gameType;

    public static ProjectDTO fromProject(Project project){
        ProjectDTO projectDTO = new ProjectDTO();
        projectDTO.setId(project.getId());
        projectDTO.setName(project.getName());
        projectDTO.setDescription(project.getDescription());
        return projectDTO;
    }
}
