package com.uyou.helperDao;

import com.uyou.entity.ProducerType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zxwang
 * @createdAt 2022/1/13 23:08
 * @description
 */
@Mapper
public interface ProducerTypeHelperMapper {
    ProducerType selectByProjectIdProducerType(@Param("projectId") int projectId, @Param("producerType") String producerType);

    List<ProducerType> selectByProjectId(@Param("projectId") int projectId);

    int getIdByProjectIdType(@Param("projectId")int projectId,@Param("producerType") String producerType);
}
