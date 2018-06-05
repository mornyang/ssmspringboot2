package com.example.ssmspringboot2.controller;

import com.example.ssmspringboot2.dao.UserMapper;
import com.example.ssmspringboot2.domain.User;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
public class UserController {
    //依赖注入
    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    @RequestMapping(value = "api/username/{name}",method = RequestMethod.GET)
    public User getUserByName(@PathVariable String name) {
        //调用dao层
        return userMapper.selectUserByName(name);
    }

    @RequestMapping(value = "api/id/{id}",method = RequestMethod.GET)
    public User getUserByID(@PathVariable int id) {
        //调用dao层
        return userMapper.selectUserByID(id);
    }

    @RequestMapping(value = "api/all",method = RequestMethod.GET)
    public List<User> getUserByID() {
        //调用dao层
        return userMapper.selectAllUser();
    }
}
