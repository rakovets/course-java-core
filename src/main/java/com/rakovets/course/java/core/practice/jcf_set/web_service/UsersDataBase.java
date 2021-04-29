package com.rakovets.course.java.core.practice.jcf_set;

import java.util.HashMap;
import java.util.Map;

public class UsersDataBase {
    Map<String, String> loginAndPasswords = new HashMap<>();

    public UsersDataBase() {
    }

    public UsersDataBase(Map<String, String> loginAndPasswords) {
        this.loginAndPasswords = loginAndPasswords;
    }

    public void addNewUser(User user) {
        if (!loginAndPasswords.containsKey(user.getLogin())) {
            loginAndPasswords.put(user.getLogin(), user.getPassword());
        }

    }

    public void deleteUser(String login) {
        if (loginAndPasswords.containsKey(login)) {
            loginAndPasswords.remove(login);
        }

    }

    public boolean exists(String login) {
        return loginAndPasswords.containsKey(login);
    }

    public void changeLogin(String login, String newLogin) {
        if (!loginAndPasswords.containsKey(newLogin) || exists(login)) {
            loginAndPasswords.put(newLogin, loginAndPasswords.get(login));
            loginAndPasswords.remove(login);
        }
    }

    public void changePassword(String login, String newPassword) {
        if (exists(login)) {
            loginAndPasswords.replace(login, loginAndPasswords.get(login), newPassword);
        }
    }

    public void showUsersDatabase() {
        System.out.println(this.toString());
    }

    public Map<String, String> getLoginAndPasswords() {
        return loginAndPasswords;
    }

    @Override
    public String toString() {
        String result = "---Users Data--- + \n";
        for (Map.Entry<String, String> key : loginAndPasswords.entrySet()) {
            result += key + "\n";
        }
        return result;
    }
}
