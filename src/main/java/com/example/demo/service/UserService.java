package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public int saveUser(User user) {
        // username没找到说明是新增
        if (user.getUsername() == null) {
            return userMapper.insertUser(user);
        } else {
            // username找到说明是更新
            return userMapper.updateUser(user);
        }
    }
}

