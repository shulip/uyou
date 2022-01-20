package com.uyou.service.impl;

import com.uyou.dao.UserMapper;
import com.uyou.dto.UserNameTypeDTO;
import com.uyou.entity.User;
import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class UserServiceImplTest {
    @Resource
    private UserMapper userMapper;
    @Autowired
    private StringEncryptor stringEncryptor;

    @Test
    void getUserById() {
        User user = userMapper.selectByPrimaryKey(5);
        UserNameTypeDTO userNameTypeDTO = new UserNameTypeDTO(user.getName(), user.getType());
        int a=1;
    }

    @Test
    void modifyUser() {
        System.out.print(stringEncryptor.encrypt("aaa"));
//        User user = new User();
//        user.setId(5);
//        user.setName("x");
//        user.setPassword(stringEncryptor.encrypt("hhh"));
//        user.setType("程序员");
//        userMapper.updateByPrimaryKey(user);
//        user = userMapper.selectByPrimaryKey(5);
        int a=1;
    }
}