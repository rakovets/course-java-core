package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class Demo {
    public static void main(String[] args) {
        Store store = new Store();
        ProducerThread producerThread = new ProducerThread(store, "ProdONE");
        ProducerThread producerThread1 = new ProducerThread(store, "ProdTWO");

        ConsumerThread consumerThread = new ConsumerThread(store, "FIRST");
        ConsumerThread consumerThread1 = new ConsumerThread(store, "SECOND");

        new Thread(producerThread).start();
        new Thread(producerThread1).start();
        new Thread(consumerThread).start();
        new Thread(consumerThread1).start();
    }
}
