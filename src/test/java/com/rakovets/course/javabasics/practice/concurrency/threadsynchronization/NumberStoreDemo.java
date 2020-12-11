package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization;

public class NumberStoreDemo {
    public static void main(String[] args) {
        Store store = new Store();
        ProducerThread producer = new ProducerThread(store);
        ConsumerThread consumer = new ConsumerThread(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
