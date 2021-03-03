package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer;

public class NumberStoreDemo {
    public static void main(String[] args) {

        Store store = new Store();
        new Thread(new ProducerThread(store)).start();
        new Thread(new ConsumerThread(store)).start();
    }
}
