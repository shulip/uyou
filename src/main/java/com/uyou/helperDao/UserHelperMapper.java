package com.uyou.helperDao;

import com.uyou.core.entity.UserSecurity;
import com.uyou.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zxwang
 * @createdAt 2022/1/18 18:25
 * @description
 */
@Mapper
public interface UserHelperMapper {
    User getPasswordByName(@Param("name") String name);

    UserSecurity findUserByUsername(@Param("name") String name);
}
