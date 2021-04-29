package com.rakovets.course.java.core.practice.jcf_set;

import java.util.HashMap;
import java.util.Map;

public class WebService {
    private Map<String, String> usersMap = new HashMap<>();

    public WebService(Map<String, String> users) {
        this.usersMap = users;
    }

    public void addUser(User user) {
        if (!usersMap.containsValue(user.getLogin())) {
            usersMap.put(user.getLogin(), user.getPassword());
        }
    }

    public void deleteUser(User user) {
        if (usersMap.containsKey(user.getLogin())) {
            usersMap.remove(user.getLogin());
        }
    }

    public boolean doesTheUserExist(String login) {
        return usersMap.containsKey(login);
    }

    public void changeLogin(User user, String newLogin) {
        String password = usersMap.get(user.getPassword());
        usersMap.remove(user.getLogin());
        usersMap.put(newLogin, password);
    }

    public void changePassword(User user, String newPassword) {
        usersMap.replace(user.getLogin(), user.getPassword(), newPassword);
    }
}
