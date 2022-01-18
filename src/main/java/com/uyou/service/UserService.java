package com.uyou.service;


import com.uyou.dto.UserDTO3;
import com.uyou.entity.User;

/**
 * @author zxwang
 * @createdAt 1/17
 * @description
 */
public interface UserService {
    UserDTO3 getUserById(Integer id);
    void modifyUser(User user);
}
