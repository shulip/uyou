package com.uyou.helperdao;

import com.uyou.entity.Project;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author yjzhang
 * @createdAt 2022/1/15 13:11
 * @description
 */

@Mapper
public interface ProjectHelperMapper {
    List<Project> selectAll();
}
