package com.rakovets.course.java.core.practice.jcf_set.dao;

import com.rakovets.course.java.core.practice.jcf_set.User;

import java.util.Set;

public interface UserDao {
    boolean add(User user);
    Set<User> listAllUsers();
    boolean updateUser(User user);


}
