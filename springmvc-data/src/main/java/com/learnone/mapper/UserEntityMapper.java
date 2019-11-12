package com.learnone.mapper;

import com.learnone.entity.User;

public interface UserEntityMapper {

    User findById(Long id);
}
