package com.example.ssmspringboot2.dao;

import com.example.ssmspringboot2.domain.User;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public User checkInfo(String username, int id) {
        User user = userMapper.selectUserByName(username);
        if(user != null && user.getId() == id){
            return user;
        }
        return null;
    }

    @Override
    public User findUserByName(String name) {
        return userMapper.selectUserByName(name);
    }

    @Override
    public User findUserByID(int id) {
        return userMapper.selectUserByID(id);
    }

    @Override
    public List<User> findAllUser() {
        return userMapper.selectAllUser();
    }
}
