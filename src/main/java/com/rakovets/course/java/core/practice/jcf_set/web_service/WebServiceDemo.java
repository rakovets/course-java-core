package com.rakovets.course.java.core.practice.jcf_set.web_service;

import java.util.HashMap;
import java.util.Map;

public class WebServiceDemo {
    public static void main(String[] args) {
        User user = new User("user1", "1111111111");
        User user1 = new User("user2", "2222222222");
        User user2 = new User("user3", "3333333333");

        Map<String, String> users = new HashMap<>();
        users.put("user1", "1111111111");
        users.put("user2", "2222222222");
        users.put("user3", "3");
        WebService webService = new WebService(users);
        System.out.println(webService.toString());
    }
}
