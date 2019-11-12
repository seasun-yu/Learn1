package com.learnone.dao;

import com.learnone.entity.User;

public interface UserDao {

    User findById(Long id);
}
