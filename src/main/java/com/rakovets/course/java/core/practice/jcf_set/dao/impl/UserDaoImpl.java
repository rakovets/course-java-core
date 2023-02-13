package com.rakovets.course.java.core.practice.jcf_set.dao.impl;

import com.rakovets.course.java.core.practice.jcf_set.User;
import com.rakovets.course.java.core.practice.jcf_set.dao.UserDao;

import java.util.HashSet;
import java.util.Set;

public class UserDaoImpl implements UserDao {
    private static long id = 1l;
    private Set<User> usersSet = new HashSet<>();

    @Override
    public boolean add(User user) {
        user.setId(id++);
        usersSet.add(user);
        System.out.println(usersSet);
        return usersSet.contains(user);
    }

    @Override
    public Set<User> listAllUsers(){
        return usersSet;
    }

    @Override
    public boolean updateUser(User user) {
        if (usersSet.contains(user)) {
            usersSet.add(user);
            return true;
        }
        return false;
    }
}
