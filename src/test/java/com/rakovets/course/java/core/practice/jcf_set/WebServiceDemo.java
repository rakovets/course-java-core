package com.rakovets.course.java.core.practice.jcf_set;

import java.util.HashMap;
import java.util.Map;

public class WebServiceDemo {
    public static void main(String[] args) {
        Client client = new Client("Mihail", 12345);
        Client client1 = new Client("Ibragim",123123 );


        Map<String, Integer> clients = new HashMap<>();
        clients.put("Mihail", 12345);
        clients.put("Ibragim", 123123);
        System.out.println(clients);
    }
}
