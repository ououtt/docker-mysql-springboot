package com.example.demo.web;

import com.example.demo.mapper.UserMapper;
import com.example.demo.orm.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author guzemin@songxiaocai.com
 * @create 2018-02-26 11:18
 **/
@RestController
public class HelloController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/hello")
    public List<User> hello() {
        return userMapper.selectAll();
    }
}
