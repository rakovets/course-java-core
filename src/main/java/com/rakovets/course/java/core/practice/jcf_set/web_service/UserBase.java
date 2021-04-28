package com.rakovets.course.java.core.practice.jcf_set.web_service;

import java.util.HashMap;
import java.util.Map;

public class UserBase {
    private Map<String, String> users = new HashMap<>();

    public UserBase() {

    }

    public UserBase(Map<String, String> users) {
        this.users = users;
    }

    public boolean addUser(User user) {
        if (users.containsValue(user.getKey())) {
            return false;
        } else {
            users.put(user.getKey(), user.getValue());
            return true;
        }
    }

    public boolean deleteUser(User user) {
        if (users.containsKey(user.getKey()) && users.get(user.getKey()).equals(user.getValue())) {
            users.remove(user.getKey());
            return true;
        } else {
            return false;
        }
    }

    public boolean isExist(String nickName) {
        return users.containsKey(nickName);
    }

    public void changeNickName(User user, String newNickName) {
        String tempPassword = users.get(user.getValue());
        deleteUser(user);
        users.put(newNickName, tempPassword);
    }

    public void changePassword(User user, String newPassword) {
        users.replace(user.getKey(), user.getValue(), newPassword);
    }

    @Override
    public String toString() {
        return "UserBase{" +
                "users=" + users +
                '}';
    }
}
