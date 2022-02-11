package com.uyou.helperdao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zxwang
 * @createdAt 2022/1/14 13:52
 * @description
 */
@Mapper
public interface GameTypeHelperMapper {
    List<String> selectTypeByGameId(@Param("gameId") Integer gameId);
}
