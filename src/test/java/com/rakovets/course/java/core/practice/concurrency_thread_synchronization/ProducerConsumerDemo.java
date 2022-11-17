package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer.ConsumerThread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer.ProducerThread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer.Store;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Store store = new Store(10);
        ProducerThread producer1 = new ProducerThread(store);
        ProducerThread producer2 = new ProducerThread(store);
        ConsumerThread consumer1 = new ConsumerThread(store);
        ConsumerThread consumer2 = new ConsumerThread(store);

        new Thread(producer1).start();
        new Thread(producer2).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();
    }
}
