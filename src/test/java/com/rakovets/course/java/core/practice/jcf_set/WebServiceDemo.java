package com.rakovets.course.java.core.practice.jcf_set;

import java.util.HashMap;
import java.util.Map;

public class WebServiceDemo {
    public static void main(String[] args) {
        User user = new User("tatsiana", "1234567654321");
        User user1 = new User("bober", "qwerty123");
        User user2 = new User("inglot", "inglot123");
        User user3 = new User("bober12", "bober123");

        Map<String, String> users = new HashMap<>();
        users.put("tatsiana", "1234567654321");
        users.put("bober", "qwerty123");
        users.put("inglot", "inglot123");
        users.put("bober12", "bober123");
        WebService webService = new WebService(users);
        System.out.println(webService.toString());
    }
}
