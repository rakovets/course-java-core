package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;


import java.util.ArrayList;
import java.util.List;

public class StoreDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Store store = new Store(numbers);
        Thread producer1 = new Thread(new ProducerThread(store));
        Thread producer2 = new Thread(new ProducerThread(store));
        Thread producer3 = new Thread(new ProducerThread(store));
        Thread consumer1 = new Thread(new ConsumerThread(store));
        Thread consumer2 = new Thread(new ConsumerThread(store));
        Thread consumer3 = new Thread(new ConsumerThread(store));
        producer1.start();
        producer2.start();
        producer3.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();
    }
}
