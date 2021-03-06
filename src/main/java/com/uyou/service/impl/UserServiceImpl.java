package com.uyou.service.impl;

import com.uyou.core.entity.UserSecurity;
import com.uyou.dao.UserMapper;
import com.uyou.dto.UserDTO3;
import com.uyou.dto.UserNameTypeDTO;
import com.uyou.entity.User;
import com.uyou.exception.UserExistException;
import com.uyou.helperdao.UserHelperMapper;
import com.uyou.service.UserService;
import com.uyou.utils.IdGenerator;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yjzhang
 * @createdAt 1/17
 * @description
 */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;
    @Autowired
    private UserHelperMapper userHelperMapper;
    @Autowired
    private StringEncryptor stringEncryptor;

    /**
     * @param
     * @return UserDTO3
     * @author yjzhang
     */
    @Override
    public UserNameTypeDTO getUserById(){
        UserSecurity principal = (UserSecurity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userMapper.selectByPrimaryKey(principal.getId());
        return new UserNameTypeDTO(user.getName(), user.getType());
    }

    /**
     * @param userDTO3
     * @return
     * @author yjzhang
     */
    @Override
    public void modifyUser(UserDTO3 userDTO3){
        UserSecurity principal = (UserSecurity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = new User();
        user.setId(principal.getId());
        user.setPassword(stringEncryptor.encrypt(userDTO3.getPassword()));
        user.setName(userDTO3.getName());
        user.setType(userDTO3.getType());
        userMapper.updateByPrimaryKey(user);
    }

    @Override
    public int register(String name, String password, String type){
        UserSecurity user = userHelperMapper.findUserByUsername(name);
        if (null != user)
            throw new UserExistException("????????????????????????");

        int userId = IdGenerator.getDateId();
        User userIns = new User();
        userIns.setId(userId);
        userIns.setName(name);
        userIns.setPassword(stringEncryptor.encrypt(password));
        userIns.setType(type);

        return userMapper.insert(userIns);
    }

    @Override
    public UserDetails loadUserByUsername(String username){
        UserSecurity user = userHelperMapper.findUserByUsername(username);
        if (user == null)
            throw new UsernameNotFoundException("??????????????????!");

        return user;
    }
}
