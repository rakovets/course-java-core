package com.rakovets.course.java.core.practice.concurrency.thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producerConsumer.Consumer;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producerConsumer.Producer;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producerConsumer.Store;
import java.util.LinkedList;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Store store = new Store(new LinkedList<>());
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        producer.start();
        consumer.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        store.isActive(false);
    }
}
