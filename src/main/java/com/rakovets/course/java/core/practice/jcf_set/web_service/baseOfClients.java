package com.rakovets.course.java.core.practice.jcf_set.web_service;

import java.util.HashMap;
import java.util.Map;

public class baseOfClients {
    private Map<String,String> data = new HashMap<>();

    @Override
    public String toString() {
        return "data{" + "data =" + data + '}';
    }

    public baseOfClients(Map<String,String> data){
        this.data = data;
    }

    public void addUser(User user){
        if (data.containsValue(user.getKey())){
            System.out.println("This loggin is used");
        }
        else
        data.put(user.getKey(), user.getValue());
        System.out.println("Ur logging succesfully created");
    }

    public void deleteUser(User user){
       data.remove(user.getKey());
        System.out.println("Profile succesfully deleted");
    }

    public boolean nameChecking(String name){
        if (data.containsKey(name)){
            System.out.println("User exist");
            return true;
        }
        else {
            System.out.println("User is`t exist");
        }
        return false;
    }

    public void passwordChange(User user, String newPass){
        data.replace(user.getKey(), user.getValue(), newPass);
    }

    public void logginReplace(User user,String newLogg){
        String copy = user.getValue();
        deleteUser(user);
        data.put(newLogg,copy);
    }

}
