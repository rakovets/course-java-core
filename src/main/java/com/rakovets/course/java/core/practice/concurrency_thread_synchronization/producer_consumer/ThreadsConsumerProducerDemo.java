package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

public class ThreadsConsumerProducerDemo {
    public static void main(String[] args) {
        Store store = new Store();
        ConsumerThread consumerThread1 = new ConsumerThread(store);
        ConsumerThread consumerThread2 = new ConsumerThread(store);
        ProducerThread producerThread1 = new ProducerThread(store);
        ProducerThread producerThread2 = new ProducerThread(store);
        consumerThread1.start();
        consumerThread2.start();
        producerThread1.start();
        producerThread2.start();
    }
}
