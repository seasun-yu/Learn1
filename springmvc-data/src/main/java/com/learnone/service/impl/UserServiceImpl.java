package com.learnone.service.impl;


import com.learnone.entity.User;
import com.learnone.mapper.UserEntityMapper;
import com.learnone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserEntityMapper mapper;

    @Override
    public User findById(Long id) {
        return mapper.findById(id);
    }
}
