package com.rakovets.course.java.core.practice.concurrency;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        LinkedList<Integer> commonResource= new LinkedList<>();
        Thread thread = new Thread(new Producer(commonResource));
        Thread thread1= new Thread(new Consumer(commonResource));
        Thread thread2= new Thread(new Consumer(commonResource));
        thread.start();
        thread1.start();
        thread2.start();
    }
}
