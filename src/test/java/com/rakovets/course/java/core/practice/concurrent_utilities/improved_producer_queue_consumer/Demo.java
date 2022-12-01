package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.util.ArrayDeque;
import java.util.Queue;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> queue = new ArrayDeque<>();
        Producer producer = new Producer(queue);

        producer.start();
        producer.join();
        System.out.println(queue);
    }
}
