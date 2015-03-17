package com.javakiri.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javakiri.bookstore.domain.User;
import com.javakiri.bookstore.mapper.UserMapper;

@Service
public class UserAccountService {
    
    @Autowired
    private UserMapper userMapper;
    
    @Autowired
    private User user;

    public User getUserAccountByUsername(String username) {
        return userMapper.getUserByUsername(username);
    }
    
}
