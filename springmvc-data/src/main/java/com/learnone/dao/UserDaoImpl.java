package com.learnone.dao;

import com.learnone.entity.User;
import com.learnone.mapper.UserEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoImpl implements UserDao {

    @Autowired
    private UserEntityMapper mapper;

    @Override
    public User findById(Long id) {
        return mapper.findById(id);
    }
}
