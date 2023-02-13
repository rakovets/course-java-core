package com.rakovets.course.java.core.practice.jcf_set.controller;

import com.rakovets.course.java.core.practice.jcf_set.User;
import com.rakovets.course.java.core.practice.jcf_set.service.UserService;
import com.rakovets.course.java.core.practice.jcf_set.service.impl.UserServiceImpl;

public class UserController {
    private static final UserService userService = new UserServiceImpl();

    public boolean add(User user) {
        return userService.add(user);
    }
    public boolean updateUser(User user) {
        return userService.updateUser(user);
    }
}
