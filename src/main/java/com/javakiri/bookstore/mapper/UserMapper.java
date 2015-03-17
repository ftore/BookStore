package com.javakiri.bookstore.mapper;

import com.javakiri.bookstore.domain.User;

public interface UserMapper {
    public User getUserByUsername(String username);

}
