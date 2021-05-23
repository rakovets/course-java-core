package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer.ConsumerThread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer.ProducerThread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer.Store;

public class StoreDemo {
    public static void main(String[] args) {
        Store store = new Store();

        Thread producer = new Thread(new ProducerThread(store),"ProducerThread");
        Thread consumer1 = new Thread(new ConsumerThread(store),"ConsumerThread1");
        Thread consumer2 = new Thread(new ConsumerThread(store),"ConsumerThread2");
        Thread consumer3 = new Thread(new ConsumerThread(store),"ConsumerThread3");
        producer.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        store.endOfExchange();
    }
}
