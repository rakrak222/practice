package com.baek.blog.service;

import com.baek.blog.entity.User;

public interface UserService {
    void registerUser(User user);

    User findByEmail(String email);
}
