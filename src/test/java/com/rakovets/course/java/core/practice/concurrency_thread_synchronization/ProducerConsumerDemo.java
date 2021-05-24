package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer.Consumer;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer.Producer;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer.Store;

public class ProducerConsumerDemo {
    public static void main(String[] args) throws InterruptedException {
        Store store = new Store();
        Producer producer = new Producer("producer", store);
        Consumer consumer = new Consumer("consumer", store);
        Thread threadProducer = new Thread(producer);
        Thread threadConsumer = new Thread(consumer);
        threadProducer.start();
        threadConsumer.start();

    }
}
