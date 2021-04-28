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

    public boolean addNewUser(User user) {
        if(!loginAndPasswords.containsKey(user.getLogin())) {
            loginAndPasswords.put(user.getLogin(), user.getPassword());
            return true;
        }
        return false;
    }

    public boolean deleteUser(String login) {
        if(loginAndPasswords.containsKey(login)) {
            loginAndPasswords.remove(login);
            return true;
        }
        return false;
    }

    public boolean exists(User user) {
        return loginAndPasswords.containsKey(user.getLogin());
    }

    public boolean changeLogin(User user, String newLogin) {
        if(!loginAndPasswords.containsKey(newLogin) || exists(user)) {
            loginAndPasswords.put(newLogin, user.getPassword());
            loginAndPasswords.remove(user.getLogin());
            return true;
        }
        return false;
    }

    public void changePassword(User user, String newPassword) {
        if (exists(user)){
            loginAndPasswords.replace(user.getLogin(), user.getPassword(), newPassword);
        }
    }

    public void showUsersDatabase() {
        System.out.println(loginAndPasswords.toString());
    }

    @Override
    public String toString() {
        return "UsersDataBase[" + loginAndPasswords + ']';
    }
}
