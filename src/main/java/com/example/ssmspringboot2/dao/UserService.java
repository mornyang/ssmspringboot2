package com.example.ssmspringboot2.dao;

import com.example.ssmspringboot2.domain.User;
import java.util.List;

public interface UserService {
    User checkInfo(String username, int id);
    User findUserByName(String name);
    User findUserByID(int id);
    List<User> findAllUser();
}
