package com.uyou.controller;

import com.uyou.dto.*;
import com.uyou.service.ProjectService;
import com.uyou.utils.ResultWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResultWrapper joinProject(@RequestParam int projectId, @RequestParam String producerType) {
        if (projectService.joinProject(projectId, producerType)){
            return new ResultWrapper();
        }
        return new ResultWrapper(100,"人员已满");
    }

    @GetMapping("/project")
    public ResultWrapper getAllProject() {
        List<ProjectDTO> allProject = projectService.getAllProject();
        return new ResultWrapper(allProject);
    }

    @GetMapping("/my")
    public ResultWrapper getSelfProject(){
        ProjectSelfDTO selfProject = projectService.getSelfProject();
        return new ResultWrapper(selfProject);
    }

    @GetMapping("/project/{id}")
    public ResultWrapper getProjectById(@PathVariable Integer id){
        ProjectDetailDTO detailProject = projectService.getDetailProject(id);
        return new ResultWrapper(detailProject);
    }
}
