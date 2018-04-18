package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {

    User save(User user);
    User findByAge(Integer age);
}
