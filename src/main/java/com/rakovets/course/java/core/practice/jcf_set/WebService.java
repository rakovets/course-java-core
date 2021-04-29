package com.rakovets.course.java.core.practice.jcf_set;

import java.util.HashMap;
import java.util.Map;

public class WebService {
    private Map<String, String> users = new HashMap<>();

    public WebService(Map<String, String> users) {
        this.users = users;
    }

    public boolean addNewUser(User user) {
        if (users.containsValue(user.getLogin())) {
            return false;
        } else {
            users.put(user.getLogin(), user.getPassword());
            return true;
        }
    }

    public boolean deleteUser(User user) {
        if (users.containsKey(user.getLogin())) {
            users.remove(user.getLogin());
            return true;
        } else {
            return false;
        }
    }

    public boolean isContainsUser(String login) {
        return users.containsKey(login);
    }

    public void changeLogin(User user, String newLogin) {
        String password = users.get(user.getPassword());
        users.remove(user.getLogin());
        users.put(newLogin, password);
    }

    public void changePassword(User user, String newPassword) {
        users.replace(user.getLogin(), user.getPassword(), newPassword);
    }

    @Override
    public String toString() {
        return "Web Service {" +
                "users=" + users +
                '}';
    }
}
