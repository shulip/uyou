package com.uyou.service;

import com.uyou.dto.ProjectAllDTO;
import com.uyou.dto.ProjectCreateDTO;
import com.uyou.dto.ProjectDetailDTO;
import com.uyou.dto.ProjectSelfDTO;

/**
 * @author zxwang
 * @createdAt 2022/1/13 19:55
 * @description
 */
public interface ProjectService {
    public boolean createProject(ProjectCreateDTO projectCreateDTO);

    public boolean joinProject(int projectId, String producerType);

    public ProjectAllDTO getAllProject();

    public ProjectSelfDTO getSelfProject();

    public ProjectDetailDTO getDetailProject(Integer projectId);
}
