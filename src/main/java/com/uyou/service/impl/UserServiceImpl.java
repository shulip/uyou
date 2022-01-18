package com.uyou.service.impl;

import com.uyou.dao.UserMapper;
import com.uyou.dto.UserDTO3;
import com.uyou.entity.User;
import com.uyou.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yjzhang
 * @createdAt 1/17
 * @description
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    /**
     * @param id
     * @return UserDTO3
     * @author yjzhang
     */
    @Override
    public UserDTO3 getUserById(Integer id){
        User user = userMapper.selectByPrimaryKey(id);
        return new UserDTO3(user.getId(), user.getName(), user.getType());
    }

    /**
     * @param user
     * @return
     * @author yjzhang
     */
    @Override
    public void modifyUser(User user){
        userMapper.updateByPrimaryKey(user);
    }
}
