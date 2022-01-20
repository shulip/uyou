package com.uyou.service;

import com.uyou.dto.*;

import java.util.List;

/**
 * @author zxwang
 * @createdAt 2022/1/13 19:55
 * @description
 */
public interface ProjectService {
    public boolean createProject(ProjectCreateDTO projectCreateDTO);

    public boolean joinProject(int projectId, String producerType);

    public List<ProjectDTO> getAllProject();

    public ProjectSelfDTO getSelfProject();

    public ProjectDetailDTO getDetailProject(Integer projectId);
}
