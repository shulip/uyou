package com.uyou.helperdao;

import com.uyou.entity.ProjectProducer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zxwang
 * @createdAt 2022/1/14 13:11
 * @description
 */
@Mapper
public interface ProjectProducerHelperMapper {
    List<ProjectProducer> selectByProducerId(@Param("producerId") Integer producerId);
    List<ProjectProducer> selectByProjectId(@Param("projectId") Integer projectId);
}
