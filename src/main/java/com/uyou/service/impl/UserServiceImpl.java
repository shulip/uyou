package com.uyou.service.impl;

import com.uyou.core.entity.UserSecurity;
import com.uyou.dao.UserMapper;
import com.uyou.dto.UserDTO3;
import com.uyou.entity.Project;
import com.uyou.entity.User;
import com.uyou.exception.UserExistException;
import com.uyou.helperDao.UserHelperMapper;
import com.uyou.service.UserService;
import com.uyou.utils.IdGenerator;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Override
    public int register(String name, String password, String type) throws UserExistException {
        UserSecurity user = userHelperMapper.findUserByUsername(name);
        if (null != user)
            throw new UserExistException("该用户名已存在！");

        int userId = IdGenerator.getDateId();
        User userIns = new User();
        userIns.setId(userId);
        userIns.setName(name);
        userIns.setPassword(stringEncryptor.encrypt(password));
        userIns.setType(type);

        return userMapper.insert(userIns);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserSecurity user = userHelperMapper.findUserByUsername(username);
        if (user == null)
            throw new UsernameNotFoundException("不存在该用户!");

        return user;
    }
}
