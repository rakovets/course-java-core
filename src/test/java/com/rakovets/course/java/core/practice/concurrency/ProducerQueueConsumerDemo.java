package com.rakovets.course.java.core.practice.concurrency;

import java.nio.file.Paths;

public class ProducerQueueConsumerDemo {
    public static void main(String[] args) throws InterruptedException {
        String fileName = Paths.get("src", "test", "resources", "testFile.txt").toString();
        Container numbers = new Container();
        Thread producerThread = new Producer(numbers);
        Thread consumer1 = new Consumer(numbers, fileName);
        Thread consumer2 = new Consumer(numbers, fileName);
        Thread consumer3 = new Consumer(numbers, fileName);
        producerThread.start();
        producerThread.join();
        consumer1.start();
        consumer2.start();
        consumer3.start();
    }
}
