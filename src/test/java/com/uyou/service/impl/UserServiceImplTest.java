package com.uyou.service.impl;

import com.uyou.dao.UserMapper;
import com.uyou.dto.UserDTO3;
import com.uyou.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {
    @Resource
    private UserMapper userMapper;

    @Test
    void getUserById() {
        User user = userMapper.selectByPrimaryKey(5);
        UserDTO3 userDTO3 = new UserDTO3(user.getId(), user.getName(), user.getType());
        int a=1;
    }

    @Test
    void modifyUser() {
        User user = new User();
        user.setId(5);
        user.setName("x");
        user.setPassword("hhh");
        user.setType("程序员");
        userMapper.updateByPrimaryKey(user);
        user = userMapper.selectByPrimaryKey(5);
        int a=1;
    }
}