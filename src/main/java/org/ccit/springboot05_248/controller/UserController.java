package org.ccit.springboot05_248.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ccit.springboot05_248.entity.User;

import org.ccit.springboot05_248.mapper.UserMapper;

@RestController

public class UserController {
    @Autowired //自动注入
    private UserMapper userMapper;

    @RequestMapping("/login")
    public int login(@RequestBody User user){
        User u= userMapper.selectByUsername(user.getUsername());
        if (u !=null){
            if (user.getPassword().equals(u.getPassword())){
                return 1;
            }
            return 2;
        }
        return 3;
    }

}

