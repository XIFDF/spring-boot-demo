package com.xifdf.springbootdemo.controller;

import com.xifdf.springbootdemo.mapper.UserMapper;
import com.xifdf.springbootdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/index")
    public String getIndexBody() {
        return userMapper.getUserById("123").getNickname();
    }
}
