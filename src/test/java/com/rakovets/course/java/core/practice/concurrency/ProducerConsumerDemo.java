package com.rakovets.course.java.core.practice.concurrency;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;

public class ProducerConsumerDemo {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new ArrayDeque<>();
        Producer producer = new Producer(queue);
        Consumer consumer1 = new Consumer("Consumer1", queue);
        Consumer consumer2 = new Consumer("Consumer2", queue);
        consumer1.start();
        consumer2.start();
        producer.start();
    }
}
