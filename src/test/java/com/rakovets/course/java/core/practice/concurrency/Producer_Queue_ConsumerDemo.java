package com.rakovets.course.java.core.practice.concurrency;

import java.util.LinkedList;
import java.util.Queue;

public class Producer_Queue_ConsumerDemo {
    public static void main(String[] args) {
        String fileName = "src/test/java/com/rakovets/course/java/core/practice/concurrency/testFile.txt";
        Container numbers = new Container();
        Thread producerThread = new Producer(numbers);
        Thread consumer1 = new Consumer(numbers, fileName);
        Thread consumer2 = new Consumer(numbers, fileName);
        Thread consumer3 = new Consumer(numbers, fileName);
        producerThread.start();
        try {
            producerThread.join();
        } catch (InterruptedException e) {
            System.out.println(e);;
        }
        consumer1.start();
        consumer2.start();
        consumer3.start();
    }
}
