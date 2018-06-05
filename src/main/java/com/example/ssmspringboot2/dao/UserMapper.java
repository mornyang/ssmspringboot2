package com.example.ssmspringboot2.dao;

import com.example.ssmspringboot2.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper     //声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
@Repository
public interface UserMapper {
    User selectUserByName(String name);
    User selectUserByID(int id);
    List<User> selectAllUser();
}
