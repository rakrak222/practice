package com.baek.blog.mapper;

import com.baek.blog.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findByEmail(String email);

    void insertUser(User user);
}
