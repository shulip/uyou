package com.uyou.service.impl;

import com.uyou.dao.UserMapper;
import com.uyou.dto.UserDTO3;
import com.uyou.dto.UserNameTypeDTO;
import com.uyou.entity.User;
import com.uyou.service.ProjectService;
import com.uyou.service.UserService;
import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@SpringBootTest
class UserServiceImplTest {
    @Resource
    private UserMapper userMapper;
    @Autowired
    private StringEncryptor stringEncryptor;
    @Autowired
    private UserService userService;

    @Test
    @Transactional
    @Rollback()
    void getUserById() {
        UserNameTypeDTO userNameTypeDTO = userService.getUserById();
        System.out.println(userNameTypeDTO.toString());
    }

    @Test
    @Transactional
    @Rollback()
    void modifyUser() {
        UserDTO3 userDTO3 = new UserDTO3("b", "bbbbbb", "运营");
        userService.modifyUser(userDTO3);
    }

    @Test
    @Transactional
    @Rollback()
    void register() {
        try {
            System.out.println(userService.register("x", "xxxx", "美术"));
        }catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(userService.register("zyj", "zyjzyj", "程序员"));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Transactional
    @Rollback()
    void loadUserByUsername() {
        try {
            UserDetails userDetails = userService.loadUserByUsername("x");
            System.out.println(userDetails.toString());
        }catch (Exception e) {
            e.printStackTrace();
        }

        try {
            UserDetails userDetails = userService.loadUserByUsername("zyxwvu");
            System.out.println(userDetails.toString());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
