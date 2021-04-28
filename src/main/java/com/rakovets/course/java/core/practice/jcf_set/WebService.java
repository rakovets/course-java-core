package com.rakovets.course.java.core.practice.jcf_set;

import java.util.Map;

public class WebService {
    private Map<String, String> users;

    public WebService(Map<String, String> users) {
        this.users = users;
    }

    public void setNewUser(String login, String password) {
        users.put(login, password);
    }

    public void deleteUser(String login, String password) {
        users.remove(login);
   }

    public boolean checkUserExistence(String login) {
        return users.containsKey(login);
    }

    public void changeUserLogin(String login, String newLogin) {
        String password = users.get(login);
        users.remove(login);
        users.put(newLogin, password);
    }

    public void changeUserPassword(String login, String newPassword) {
        users.put(login, newPassword);
    }





}
