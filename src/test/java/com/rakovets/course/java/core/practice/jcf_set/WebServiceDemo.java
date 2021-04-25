package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.web_service.Menu;
import com.rakovets.course.java.core.practice.jcf_set.web_service.User;
import com.rakovets.course.java.core.practice.jcf_set.web_service.UserBase;

import java.util.HashMap;
import java.util.Map;

public class WebServiceDemo {
    public static void main(String[] args) {
//        User user = new User("аднрей", "221");
//        User user1 = new User("Петя", "qwe123");
        Map<String, String> map = new HashMap<>();
        map.put("аднрей", "221");
        map.put("Петя", "qwe123");
        UserBase userBase = new UserBase(map);
        Menu menu = new Menu();
        menu.menu(userBase);
        System.out.println(userBase.toString());
    }
}
