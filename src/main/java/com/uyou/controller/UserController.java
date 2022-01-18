package com.uyou.controller;

import com.uyou.dto.UserDTO3;
import com.uyou.entity.User;
import com.uyou.service.UserService;
import com.uyou.utils.ResultWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author yjzhang
 * @createdAt 1/17
 * @description
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/info/{id}")
    public ResultWrapper getUserById(@PathVariable("id") Integer id){
        UserDTO3 userDTO3 = userService.getUserById(id);
        return new ResultWrapper(userDTO3);
    }

    @PutMapping("/info")
    public ResultWrapper modifyUser(@RequestBody User user){
        userService.modifyUser(user);
        return new ResultWrapper();
    }
}
