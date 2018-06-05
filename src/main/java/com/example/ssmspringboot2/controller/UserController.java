package com.example.ssmspringboot2.controller;

import com.example.ssmspringboot2.dao.UserService;
import com.example.ssmspringboot2.domain.User;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    private UserService userService;
    //依赖注入
    @Autowired
    public void setUserMapper(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "api/{name}&{id}",method = RequestMethod.GET)
    public String getUserByNameAndID(@PathVariable("name") String name, @PathVariable("id") int id) {
        //调用dao层
        User user = userService.checkInfo(name, id);
        return user == null ? "查询无结果":user.toString();
    }

    @RequestMapping(value = "api/username/{name}",method = RequestMethod.GET)
    public User getUserByName(@PathVariable String name) {
        //调用dao层
        return userService.findUserByName(name);
    }

    @RequestMapping(value = "api/id/{id}",method = RequestMethod.GET)
    public User getUserByID(@PathVariable int id) {
        //调用dao层
        return userService.findUserByID(id);
    }

    @RequestMapping(value = "api/all",method = RequestMethod.GET)
    public List<User> getAllUser() {
        //调用dao层
        return userService.findAllUser();
    }
}
