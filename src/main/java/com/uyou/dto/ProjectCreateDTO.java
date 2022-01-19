package com.uyou.dto;

import com.uyou.entity.GameType;
import com.uyou.entity.ProducerType;
import com.uyou.entity.Project;
import com.uyou.entity.ProjectProducer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zxwang
 * @createdAt 2022/1/13 20:28
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectCreateDTO implements Serializable {
    private String name;
    private String description;
    private List<String> gameType;
    private List<ProducerTypeDTO> producerTypes;

    public Project getProject() {
        Project project = new Project();
        project.setName(name);
        project.setDescription(description);
        return project;
    }

    public List<GameType> getIdGameType(int projectId) {
        List<GameType> gameTypeList = new ArrayList<>();

        for (String type : gameType) {
            GameType gameType = new GameType();
            gameType.setGameId(projectId);
            gameType.setGameType(type);

            gameTypeList.add(gameType);
        }

        return gameTypeList;
    }

    public List<ProducerType> getProducerType(int projectId) {
        List<ProducerType> producerTypeList = new ArrayList<>();
        for (ProducerTypeDTO producerTypeDTO : producerTypes) {
            ProducerType producerType = new ProducerType();
            producerType.setGameId(projectId);
            producerType.setProducerType(producerTypeDTO.getProducerType());
            producerType.setNeededNumber(producerTypeDTO.getNeededNumber());
            producerType.setNowNumber(0);
            producerType.setRecruit(true);

            producerTypeList.add(producerType);
        }
        return producerTypeList;
    }

    public ProjectProducer getProjectProducer(int projectId){
        ProjectProducer projectProducer = new ProjectProducer();
        projectProducer.setGameId(projectId);
        projectProducer.setIsCreator(true);
        return projectProducer;
    }
}
