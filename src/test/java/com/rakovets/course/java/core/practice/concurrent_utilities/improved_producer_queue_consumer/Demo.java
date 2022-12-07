package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        Consumer consumer1 = new Consumer(queue);
        Consumer consumer2 = new Consumer(queue);
        Consumer consumer3 = new Consumer(queue);

        producer.start();
        consumer.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();

        producer.join();
        consumer.join();
        consumer1.join();
        consumer2.join();
        consumer3.join();

        System.out.println(queue);
    }
}
