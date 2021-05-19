package com.rakovets.course.java.core.practice.concurrency.threads;

import java.util.Deque;
import java.util.LinkedList;

public class ReadQueueAndWriteAtFile implements Runnable {
    public static Deque<Integer> listOfNumbers = new LinkedList<>();

    public static Deque<Integer> getListOfNumbers() {
        return listOfNumbers;
    }

    @Override
    public void run() {
        System.out.println("\n");
        Thread read = new Thread(new Producer());
        read.setName("Producer");
        read.start();
        Thread write = new Thread(new Consumer());
        write.setName("Consumer");
        Thread write2 = new Thread(new Consumer());
        write2.setName("Consumer2");
        Thread write3 = new Thread(new Consumer());
        write3.setName("Consumer3");
        write.start();
        write2.start();
        write3.start();
    }
}
