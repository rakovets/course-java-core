package com.rakovets.course.java.core.practice.concurrency;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        LinkedList<Integer> commonResource= new LinkedList<>();
        Thread thread = new Thread(new Producer(commonResource));
        Thread thread1= new Thread(new Consumer(commonResource));
        Thread thread2= new Thread(new Consumer(commonResource));
        Thread thread3= new Thread(new Consumer(commonResource));
        Thread thread4= new Thread(new Consumer(commonResource));
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread.join();
    }
}
