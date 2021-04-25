package com.rakovets.course.java.core.practice.jcf_set.web_service;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.stream.Stream;

public class ServerRequestQueue {
    static Random rnd = new Random();
    static Queue<User> clientRequestPriority = new PriorityQueue<>(new ComparatorForQueue());

    public static void addRandomUsers() {
        for (int i = 1; i < rnd.nextInt(20); i ++)
        clientRequestPriority.add(new User("User" + rnd.nextInt(1000), i));
    }

    public static void addCustomUser() {
        clientRequestPriority.add((new User(ClientController.inputLogin(), ClientController.inputPassword())));
    }

    public static Stream<User> printQueue() {
        for (int i = 0; i < clientRequestPriority.size(); i++) {
            System.out.println(clientRequestPriority.toArray()[i].toString());
        }
        return clientRequestPriority.stream().sorted(new ComparatorForQueue());
    }
}
