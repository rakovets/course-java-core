package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_сonsumer;

public class NumberStoreDemo {
    public static void main(String[] args) {
        Store store = new Store();
        Thread producerThread = new Thread(new ProducerThread(store));
        Thread consumerThread = new Thread(new ConsumerThread(store));
        producerThread.start();
        consumerThread.start();
    }
}
