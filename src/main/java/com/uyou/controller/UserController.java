package com.uyou.controller;

import com.uyou.dto.UserDTO3;
import com.uyou.dto.UserNameTypeDTO;
import com.uyou.entity.User;
import com.uyou.exception.UserExistException;
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

    @GetMapping("/info")
    public ResultWrapper getUserById() {
        UserNameTypeDTO userNameTypeDTO = userService.getUserById();
        return new ResultWrapper(userNameTypeDTO);
    }

    @PutMapping("/info")
    public ResultWrapper modifyUser(@RequestBody UserDTO3 userDTO3) {
        userService.modifyUser(userDTO3);
        return new ResultWrapper();
    }

    @PostMapping("/register")
    public ResultWrapper register(@RequestParam String name, @RequestParam String password, @RequestParam String type) {
        try {
            userService.register(name,password,type);
        }catch (UserExistException e){
            return new ResultWrapper(e.getCode(),e.getMessage());
        }

        return new ResultWrapper();
    }
}
