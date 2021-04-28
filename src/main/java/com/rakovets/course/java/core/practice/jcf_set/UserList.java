package com.rakovets.course.java.core.practice.jcf_set;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserList {
    Map<String, Map<String, String>> userList;

    public UserList(){
        userList = new HashMap<>();
    }

    public void addNewUser(String user, String login, String password) {
        Map<String, String> userLoginAndPassword = new HashMap<>();
        userLoginAndPassword.put(login, password);
        userList.put(user,userLoginAndPassword);
    }

    public void deleteUser(String user) {
        userList.remove(user);
    }

    public boolean isPresent(String user) {
        return userList.containsKey(user);
    }

    public void changeLogin(String user, String newLogin) {
        String password = "";
        for(Map.Entry<String, String> key : userList.get(user).entrySet()){
            password = key.getValue();
        }
        Map<String, String> newValue = new HashMap<>();
        newValue.put(newLogin, password);
        userList.replace(user, userList.get(user), newValue);
    }

    public void changePassword(String user, String newPassword) {
        String password = "";
        String login = "";
        for(Map.Entry<String, String> key : userList.get(user).entrySet()){
            password = key.getValue();
            login = key.getKey();
        }
        userList.get(user).replace(login,password,newPassword);
    }

    @Override
    public String toString() {
        return "UserList{" +
                "userList=" + userList +
                '}';
    }
}
