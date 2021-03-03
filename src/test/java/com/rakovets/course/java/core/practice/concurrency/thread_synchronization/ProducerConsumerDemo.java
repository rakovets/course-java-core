package com.rakovets.course.java.core.practice.concurrency.thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producerConsumer.Consumer;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producerConsumer.Producer;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Store store = new Store();

        Thread producer = new Producer(store);
        Thread consumer1 = new Consumer(store);
        Thread consumer2 = new Consumer(store);
        Thread consumer3 = new Consumer(store);
        producer.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        store.setInterruption(false);
    }
}
