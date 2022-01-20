package com.uyou.service;


import com.uyou.dto.UserDTO3;
import com.uyou.dto.UserNameTypeDTO;
import com.uyou.entity.User;
import com.uyou.exception.UserExistException;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author zxwang
 * @createdAt 1/17
 * @description
 */
public interface UserService extends UserDetailsService {
    UserNameTypeDTO getUserById();

    void modifyUser(UserDTO3 userDTO3);

    int register(String name,String password,String type) throws UserExistException;
}
