package com.uyou.service.impl;

/**
 * @author zxwang
 * @createdAt 2022/1/13 19:55
 * @description
 */

import com.uyou.core.entity.UserSecurity;
import com.uyou.dao.*;
import com.uyou.dto.*;
import com.uyou.entity.*;
import com.uyou.helperDao.GameTypeHelperMapper;
import com.uyou.helperDao.ProducerTypeHelperMapper;
import com.uyou.helperDao.ProjectHelperMapper;
import com.uyou.helperDao.ProjectProducerHelperMapper;
import com.uyou.service.ProjectService;
import com.uyou.utils.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Resource
    private ProjectMapper projectMapper;
    @Resource
    private GameTypeMapper gameTypeMapper;
    @Resource
    private ProducerTypeMapper producerTypeMapper;
    @Resource
    private ProjectProducerMapper projectProducerMapper;
    @Resource
    private UserMapper userMapper;
    @Autowired
    private ProducerTypeHelperMapper producerTypeHelperMapper;
    @Autowired
    private ProjectProducerHelperMapper projectProducerHelperMapper;
    @Autowired
    private GameTypeHelperMapper gameTypeHelperMapper;
    @Autowired
    private ProjectHelperMapper projectHelperMapper;


    /**
     * @param projectCreateDTO
     * @return
     * @author zxwang
     */
    @Override
    public boolean createProject(ProjectCreateDTO projectCreateDTO) {
        UserSecurity principal = (UserSecurity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        int userId = principal.getId();

        int projectId = IdGenerator.getDateId();
        Project project = projectCreateDTO.getProject();
        project.setId(projectId);

        List<GameType> gameTypeList = projectCreateDTO.getIdGameType(projectId);

        List<ProducerType> producerTypeList = projectCreateDTO.getProducerType(projectId);

        ProjectProducer projectProducer = projectCreateDTO.getProjectProducer(projectId);
        projectProducer.setProducerId(userId);
        projectMapper.insert(project);

        for (GameType gameType : gameTypeList) {
            gameTypeMapper.insert(gameType);
        }
        for (ProducerType producerType :
                producerTypeList) {
            producerTypeMapper.insert(producerType);
        }

        projectProducerMapper.insert(projectProducer);

        return true;
    }

    /**
     * @param projectId
     * @param producerTypeStr
     * @return
     * @author zxwang
     */
    @Override
    public boolean joinProject(int projectId, String producerTypeStr) {
        UserSecurity principal = (UserSecurity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        int userId = principal.getId();
        ProducerType producerType = producerTypeHelperMapper.selectByProjectIdProducerType(projectId, producerTypeStr);
        if (producerType.getNeededNumber() >= producerType.getNowNumber()) {
            producerType.setNowNumber(producerType.getNowNumber() + 1);
            producerTypeMapper.updateByPrimaryKey(producerType);

            ProjectProducer projectProducer = new ProjectProducer();
            projectProducer.setProducerId(userId);
            projectProducer.setGameId(projectId);
            projectProducer.setIsCreator(false);
            projectProducer.setProducerTypeId(producerType.getId());
            projectProducer.setProducerType(producerTypeStr);
            projectProducerMapper.insert(projectProducer);
            return true;
        }
        return false;
    }

    /**
     * @return
     * @author yjzhang
     */
    @Override
    public ProjectAllDTO getAllProject() {
        ProjectAllDTO projectAllDTO = new ProjectAllDTO();
        List<ProjectDTO> allProject = new ArrayList<>();
        List<Project> projects = projectHelperMapper.selectAll();
        for(Project project:projects){
            List<String> gameTypes = gameTypeHelperMapper.selectTypeByGameId(project.getId());
            ProjectDTO projectDTO = ProjectDTO.fromProject(project);
            projectDTO.setGameType(gameTypes);
        }
        projectAllDTO.setAllProject(allProject);
        return projectAllDTO;
    }

    /**
     * @return
     * @author zxwang
     */
    @Override
    public ProjectSelfDTO getSelfProject() {
        UserSecurity principal = (UserSecurity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Integer id = principal.getId();

        ProjectSelfDTO projectSelfDTO = new ProjectSelfDTO();
        List<ProjectDTO> create = new ArrayList<>();
        List<ProjectDTO> join = new ArrayList<>();
        List<ProjectProducer> projectProducers = projectProducerHelperMapper.selectByProducerId(id);

        for (ProjectProducer projectProducer :
                projectProducers) {
            Project project = projectMapper.selectByPrimaryKey(projectProducer.getGameId());
            List<String> gameTypes = gameTypeHelperMapper.selectTypeByGameId(projectProducer.getGameId());
            ProjectDTO projectDTO = ProjectDTO.fromProject(project);
            projectDTO.setGameType(gameTypes);

            if (projectProducer.getIsCreator()) {
                create.add(projectDTO);
            } else {
                join.add(projectDTO);
            }
        }

        // 去重
        LinkedHashSet<ProjectDTO> creatHashSet = new LinkedHashSet<>(create);
        LinkedHashSet<ProjectDTO> joinHashSet = new LinkedHashSet<>(join);

        projectSelfDTO.setCreate(new ArrayList<>(creatHashSet));
        projectSelfDTO.setJoin(new ArrayList<>(joinHashSet));
        return projectSelfDTO;
    }

    /**
     * @param projectId
     * @author yjzhang
     */
    @Override
    public ProjectDetailDTO getDetailProject(Integer projectId){

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
            producerTypes.get(typeId.get(type)).getMembers().add(userDTO2);
        }
        projectDetailDTO.setProducerTypes(producerTypes);
        return projectDetailDTO;
    }
}
