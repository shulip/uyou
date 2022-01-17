package com.uyou.controller;

import com.uyou.dto.ProjectAllDTO;
import com.uyou.dto.ProjectCreateDTO;
import com.uyou.dto.ProjectDetailDTO;
import com.uyou.dto.ProjectSelfDTO;
import com.uyou.entity.Project;
import com.uyou.service.ProjectService;
import com.uyou.utils.ResultWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zxwang
 * @createdAt 2022/1/13 19:53
 * @description
 */
@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @PostMapping("/project")
    public ResultWrapper createProject(@RequestBody ProjectCreateDTO projectCreateDTO) {
        projectService.createProject(projectCreateDTO);

        return new ResultWrapper();
    }

    @PutMapping("/join")
    public ResultWrapper joinProject(@RequestParam int userId, @RequestParam int projectId, @RequestParam String producerType) {
        if (projectService.joinProject(userId, projectId, producerType)){
            return new ResultWrapper();
        }
        return new ResultWrapper(100,"人员已满");
    }

    @GetMapping("/project")
    public ResultWrapper getAllProject() {
        ProjectAllDTO allProject = projectService.getAllProject();
        return new ResultWrapper(allProject);
    }

    @GetMapping("/my")
    public ResultWrapper getSelfProject(@RequestParam Integer id){
        ProjectSelfDTO selfProject = projectService.getSelfProject(id);
        return new ResultWrapper(selfProject);
    }

    @GetMapping("/project/{id}")
    public ResultWrapper getProjectById(@PathVariable("id") Integer projectId){
        ProjectDetailDTO detailProject = projectService.getDetailProject(projectId);
        return new ResultWrapper(detailProject);
    }
}
