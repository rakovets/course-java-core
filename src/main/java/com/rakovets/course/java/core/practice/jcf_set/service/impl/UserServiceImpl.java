package com.rakovets.course.java.core.practice.jcf_set.service.impl;

import com.rakovets.course.java.core.practice.jcf_set.User;
import com.rakovets.course.java.core.practice.jcf_set.dao.UserDao;
import com.rakovets.course.java.core.practice.jcf_set.dao.impl.UserDaoImpl;
import com.rakovets.course.java.core.practice.jcf_set.service.UserService;

public class UserServiceImpl implements UserService {
    private final static UserDao userDao = new UserDaoImpl();

    @Override
    public boolean add(User user) {
        return validateUser(user) ? userDao.add(user) : false;
    }

    @Override
    public boolean updateUser(User user) {
        return userDao.updateUser(user);
    }

    private boolean validateUser(User user) {
        User[] users = userDao.listAllUsers().toArray(new User[0]);
        for (User user1 : users) {
            if (user1.getName().equals(user.getName()) && user1.getSurname().equals(user.getSurname())) {
                return false;
            }
        }
        return true;
    }
}
