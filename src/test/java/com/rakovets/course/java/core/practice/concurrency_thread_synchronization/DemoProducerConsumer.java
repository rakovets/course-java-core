package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer.ConsumerThread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer.ProducerThread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer.Store;

public class DemoProducerConsumer {
    public static void main(String[] args) {
        Store store = new Store();
        ProducerThread producerThread = new ProducerThread(store, "ProdOne");
        ProducerThread producerThread1 = new ProducerThread(store, "ProdTwo");
        ConsumerThread consumerThread = new ConsumerThread(store, "First");
        ConsumerThread consumerThread1 = new ConsumerThread(store, "Second");

        new Thread(producerThread).start();
        new Thread(producerThread1).start();
        new Thread(consumerThread).start();
        new Thread(consumerThread1).start();
    }
}
