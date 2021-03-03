package com.rakovets.course.java.core.practice.concurrency.thread_synchronization;

import com.rakovets.course.java.core.example.concurrency.thread_synchronization.model.Consumer;

public class StoreDemo {
    public static void main(String[] args) {
        Store store = new Store();

        Thread producer = new ProducerThread(store);
        Thread consumer1 = new ConsumerThread(store);
        Thread consumer2 = new ConsumerThread(store);
        producer.start();
        consumer1.start();
        consumer2.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
