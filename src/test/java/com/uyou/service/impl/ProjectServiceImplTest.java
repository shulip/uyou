package com.uyou.service.impl;

import com.uyou.dao.ProjectMapper;
import com.uyou.dao.UserMapper;
import com.uyou.helperdao.GameTypeHelperMapper;
import com.uyou.helperdao.ProducerTypeHelperMapper;
import com.uyou.helperdao.ProjectHelperMapper;
import com.uyou.helperdao.ProjectProducerHelperMapper;
import com.uyou.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

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
//    @Test
//    void createProject() {
//        ProducerTypeDTO p = new ProducerTypeDTO("设计",7);
//        projectService.createProject(new ProjectCreateDTO("哈利波特","魔法觉醒",
//                new ArrayList<String>(Arrays.asList("冒险", "卡牌")),
//                new ArrayList<ProducerTypeDTO>(Collections.singletonList(p))));
//    }
//
//    @Test
//    void joinProject() {
//    }
//    @Test
//    void getAllProject() {
//        List<Project> projects = projectHelperMapper.selectAll();
//        for(Project project:projects){
//            System.out.println(project.getId());
//        }
//    }
//
//    @Test
//    void getSelfProject() {
//    }
//
//
//    @Test
//    void getDetailProject() {
//        Integer projectId = 119150743;
//        List<ProjectProducer> projectProducers = projectProducerHelperMapper.selectByProjectId(projectId);
//        int a=1;
//    }
}
