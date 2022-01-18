package com.uyou.service.impl;

import com.uyou.dao.ProjectMapper;
import com.uyou.dao.UserMapper;
import com.uyou.dto.*;
import com.uyou.entity.ProducerType;
import com.uyou.entity.Project;
import com.uyou.entity.ProjectProducer;
import com.uyou.entity.User;
import com.uyou.helperDao.GameTypeHelperMapper;
import com.uyou.helperDao.ProducerTypeHelperMapper;
import com.uyou.helperDao.ProjectHelperMapper;
import com.uyou.helperDao.ProjectProducerHelperMapper;
import com.uyou.service.ProjectService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.*;

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
    void createProject() {
        ProducerTypeDTO p = new ProducerTypeDTO("设计",7);
        projectService.createProject(new ProjectCreateDTO("哈利波特","魔法觉醒",
                new ArrayList<String>(Arrays.asList("冒险", "卡牌")),
                new ArrayList<ProducerTypeDTO>(Collections.singletonList(p)),5));
    }

    @Test
    void joinProject() {
    }
    @Test
    void getAllProject() {
        List<Project> projects = projectHelperMapper.selectAll();
        for(Project project:projects){
            System.out.println(project.getId());
        }
    }

    @Test
    void getSelfProject() {
    }


    @Test
    void getDetailProject() {
        Integer projectId = 225208331;
        ProjectDetailDTO projectDetailDTO = new ProjectDetailDTO();
        Project project = projectMapper.selectByPrimaryKey(projectId);
        ProjectDTO projectDTO = ProjectDTO.fromProject(project);
        List<String> gameTypes = gameTypeHelperMapper.selectTypeByGameId(projectId);
        projectDTO.setGameType(gameTypes);
        projectDetailDTO.setProjectDTO(projectDTO);

        List<ProducerTypeDetailDTO> producerTypes = new ArrayList<>();
        List<ProducerType> allProducerType = producerTypeHelperMapper.selectByProjectId(projectId);
        HashMap<String,Integer> typeId = new HashMap<>();
        for(ProducerType producerType : allProducerType){
            String type = producerType.getProducerType();
            typeId.put(type, producerTypes.size());
            ProducerTypeDetailDTO producerTypeDetailDTO = new ProducerTypeDetailDTO(
                    type, producerType.getNeededNumber(),
                    producerType.getNowNumber(),new ArrayList<>());
            producerTypes.add(producerTypeDetailDTO);
        }
        List<ProjectProducer> projectProducers = projectProducerHelperMapper.selectByProjectId(projectId);
        for(ProjectProducer projectProducer : projectProducers){
            Integer id = projectProducer.getProducerId();
            User user = userMapper.selectByPrimaryKey(id);
            UserDTO2 userDTO2 = new UserDTO2(id, user.getName());
            String type = projectProducer.getProducerType();
            producerTypes.get(0).getMembers().add(userDTO2);
        }
        projectDetailDTO.setProducerTypes(producerTypes);
    }
}