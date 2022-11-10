package com.rakovets.course.java.core.practice.concurrency;

import java.nio.file.Path;
import java.util.LinkedList;
import java.util.Queue;

public class ProducerQueueConsumerDemo {
    public static void main(String[] args) {
        Path fileName = Path.of("D:\\OKomlik\\course-java-core\\src\\test\\resources\\testFile.txt");
        Queue<Integer> numbers = new LinkedList<>();
        Thread producerThread = new Producer(numbers);
        Thread consumer1 = new Consumer(numbers, fileName);
        Thread consumer2 = new Consumer(numbers, fileName);
        Thread consumer3 = new Consumer(numbers, fileName);
        producerThread.start();
        try {
            producerThread.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        consumer1.start();
        consumer2.start();
        consumer3.start();
    }
}
