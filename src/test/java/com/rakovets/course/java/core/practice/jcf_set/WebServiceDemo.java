package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.web_service.*;

import java.util.HashMap;
import java.util.Map;


public class WebServiceDemo {
    public static void main(String[] args) {
    Map<String,String> map = new HashMap<>();
    map.put("paul","3021741");
    baseOfClients data = new baseOfClients(map);
    menu menu = new menu();
    menu.menuOf(data);
        System.out.println(data.toString());
    }

}
