package com.uyou.service.impl;

import com.uyou.dao.ProjectMapper;
import com.uyou.dao.UserMapper;
import com.uyou.dto.*;
import com.uyou.helperdao.GameTypeHelperMapper;
import com.uyou.helperdao.ProducerTypeHelperMapper;
import com.uyou.helperdao.ProjectHelperMapper;
import com.uyou.helperdao.ProjectProducerHelperMapper;
import com.uyou.service.ProjectService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ProjectServiceImplTest {
    @Autowired
    private ProjectService projectService;
    @Autowired
    private ProjectHelperMapper projectHelperMapper;
    @Resource
    private ProjectMapper projectMapper;
    @Autowired
    private GameTypeHelperMapper gameTypeHelperMapper;
    @Autowired
    private ProducerTypeHelperMapper producerTypeHelperMapper;
    @Autowired
    private ProjectProducerHelperMapper projectProducerHelperMapper;
    @Resource
    private UserMapper userMapper;

    @Test
    @Transactional
    @Rollback()
    void testCreateProject() {
        ProducerTypeDTO p = new ProducerTypeDTO("设计",7);
        if(
                projectService.createProject(new ProjectCreateDTO("哈利波特","魔法觉醒",
                    new ArrayList<>(Arrays.asList("冒险", "角色扮演")),
                    new ArrayList<>(Collections.singletonList(p))))
        )
            System.out.println("哈利波特项目创建成功");
        else System.out.println("哈利波特项目创建失败");

        ProducerTypeDTO p1 = new ProducerTypeDTO("美术",5);
        ProducerTypeDTO p2 = new ProducerTypeDTO("运营",2);
//        if(
//                projectService.createProject(new ProjectCreateDTO("吃鸡","",
//                    new ArrayList<>(Arrays.asList("动作", "冒险")),
//                    new ArrayList<>(Arrays.asList(p,p1,p2))))
//        )
//            System.out.println("吃鸡项目创建成功");
//        else System.out.println("吃鸡项目创建失败");
        assertTrue(projectService.createProject(new ProjectCreateDTO("吃鸡","",
                new ArrayList<>(Arrays.asList("动作", "冒险")),
                new ArrayList<>(Arrays.asList(p,p1,p2)))));
    }

    @Test
    @Transactional
    @Rollback()
    void testJoinProject() {
        if(
                projectService.joinProject(128223328,"策划_")
        )
            System.out.println("加入项目成功");
        else System.out.println("加入项目失败");

//        if(
//                projectService.joinProject(130163006,"程序员")
//        )
//            System.out.println("加入项目成功");
//        else System.out.println("加入项目失败");
        assertTrue(projectService.joinProject(130163006,"程序员"));
    }

    @Test
    @Transactional
    @Rollback()
    void testGetAllProject() {
        List<ProjectDTO> projects = projectService.getAllProject();
        for(ProjectDTO project:projects){
            System.out.println(project.toString());
        }
        assertNotNull(projects);
    }

    @Test
    @Transactional
    @Rollback()
    void testGetSelfProject() {
        ProjectSelfDTO projectSelfDTO= projectService.getSelfProject();
        for(ProjectDTO project:projectSelfDTO.getCreate()){
            System.out.println(project.toString());
        }
        for(ProjectDTO project:projectSelfDTO.getJoin()){
            System.out.println(project.toString());
        }
        assertNotNull(projectSelfDTO);
    }


    @Test
    @Transactional
    @Rollback()
    void testGetDetailProject() {
        ProjectDetailDTO projectDetailDTO = projectService.getDetailProject(119150743);
        System.out.println(projectDetailDTO.toString());

        projectDetailDTO = projectService.getDetailProject(128223328);
        System.out.println(projectDetailDTO.toString());

        projectDetailDTO = projectService.getDetailProject(130163006);
        System.out.println(projectDetailDTO.toString());

        projectDetailDTO = projectService.getDetailProject(130164511);
        System.out.println(projectDetailDTO.toString());

        projectDetailDTO = projectService.getDetailProject(225208331);
        System.out.println(projectDetailDTO.toString());

        assertNotNull(projectDetailDTO);
    }
}
