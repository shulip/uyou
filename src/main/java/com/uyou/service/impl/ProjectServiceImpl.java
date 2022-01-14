package com.uyou.service.impl;

/**
 * @author zxwang
 * @createdAt 2022/1/13 19:55
 * @description
 */

import com.uyou.dao.GameTypeMapper;
import com.uyou.dao.ProducerTypeMapper;
import com.uyou.dao.ProjectMapper;
import com.uyou.dao.ProjectProducerMapper;
import com.uyou.dto.ProjectCreateDTO;
import com.uyou.dto.ProjectDTO;
import com.uyou.dto.ProjectSelfDTO;
import com.uyou.entity.GameType;
import com.uyou.entity.ProducerType;
import com.uyou.entity.Project;
import com.uyou.entity.ProjectProducer;
import com.uyou.helperDao.GameTypeHelperMapper;
import com.uyou.helperDao.ProducerTypeHelperMapper;
import com.uyou.helperDao.ProjectProducerHelperMapper;
import com.uyou.service.ProjectService;
import com.uyou.utils.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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
    @Autowired
    private ProducerTypeHelperMapper producerTypeHelperMapper;
    @Autowired
    private ProjectProducerHelperMapper projectProducerHelperMapper;
    @Autowired
    private GameTypeHelperMapper gameTypeHelperMapper;

    /**
     * @param projectCreateDTO
     * @return
     * @author zxwang
     */
    @Override
    public boolean createProject(ProjectCreateDTO projectCreateDTO) {
        int projectId = IdGenerator.getDateId();
        Project project = projectCreateDTO.getProject();
        project.setId(projectId);

        List<GameType> gameTypeList = projectCreateDTO.getIdGameType(projectId);

        List<ProducerType> producerTypeList = projectCreateDTO.getProducerType(projectId);

        ProjectProducer projectProducer = projectCreateDTO.getProjectProducer(projectId);
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
     * @param userId
     * @param projectId
     * @param producerTypeStr
     * @return
     * @author zxwang
     */
    @Override
    public boolean joinProject(int userId, int projectId, String producerTypeStr) {
        ProducerType producerType = producerTypeHelperMapper.selectByProjectIdProducerType(projectId, producerTypeStr);
        if (producerType.getNeededNumber() >= producerType.getNowNumber()) {
            producerType.setNowNumber(producerType.getNowNumber() + 1);
            producerTypeMapper.updateByPrimaryKey(producerType);

            ProjectProducer projectProducer = new ProjectProducer();
            projectProducer.setProducerId(userId);
            projectProducer.setGameId(projectId);
            projectProducer.setIsCreator(false);
            projectProducerMapper.insert(projectProducer);
            return true;
        }
        return false;
    }

    /**
     * @param id
     * @return
     * @author zxwang
     */
    @Override
    public ProjectSelfDTO getSelfProject(Integer id) {
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

        projectSelfDTO.setCreate(create);
        projectSelfDTO.setJoin(join);
        return projectSelfDTO;
    }
}
