package com.rakovets.course.java.core.practice.concurrency.thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.ConsumerThread;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.ProducerThread;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.Store;

public class StoreDemo {
    public static void main(String[] args) {
        Store store = new Store();

        Thread producer = new ProducerThread(store);
        Thread consumer1 = new ConsumerThread(store);
        Thread consumer2 = new ConsumerThread(store);
        Thread consumer3 = new ConsumerThread(store);
        producer.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        store.setWorking(false);
    }
}
