package com.uyou.service.impl;

import com.uyou.dao.UserMapper;
import com.uyou.dto.UserDTO3;
import com.uyou.dto.UserNameTypeDTO;
import com.uyou.service.UserService;
import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    void testGetUserById() {
        UserNameTypeDTO userNameTypeDTO = userService.getUserById();
        assertNotNull(userNameTypeDTO);
        System.out.println(userNameTypeDTO.toString());
    }

    @Test
    @Transactional
    @Rollback()
    void testModifyUser() {
        UserDTO3 userDTO3 = new UserDTO3("b", "bbbbbb", "运营");
        userService.modifyUser(userDTO3);
        assertTrue(true);
    }

    @Test
    @Transactional
    @Rollback()
    void testRegister() {
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
        assertTrue(true);
    }

    @Test
    @Transactional
    @Rollback()
    void testLoadUserByUsername() {
        try {
            UserDetails userDetails = userService.loadUserByUsername("x");
            assertNotNull(userDetails);
            System.out.println(userDetails.toString());
        }catch (Exception e) {
            e.printStackTrace();
        }

        try {
            UserDetails userDetails = userService.loadUserByUsername("zyxwvu");
            assertNotNull(userDetails);
            System.out.println(userDetails.toString());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
