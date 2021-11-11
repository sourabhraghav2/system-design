package com.service.impl;

import com.model.user.User;
import com.repo.UserRepo;
import com.service.UserService;

public class UserServiceImpl implements UserService {
    private UserRepo repo;

    @Override
    public boolean addUser(User user) {return true;}
}
