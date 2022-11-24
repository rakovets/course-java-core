package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

public class StoreDemo {
    public static void main(String[] args) {
        Store store = new Store(10);
        Thread producer1 = new Thread(new ProducerThread(store, 10), "producer1");
        Thread producer2 = new Thread(new ProducerThread(store, 10), "producer2");
        Thread producer3 = new Thread(new ProducerThread(store, 10), "producer3");
        Thread consumer1 = new Thread(new ConsumerThread(store), "consumer1");
        Thread consumer2 = new Thread(new ConsumerThread(store), "consumer2");
        Thread consumer3 = new Thread(new ConsumerThread(store), "consumer3");
        producer1.start();
        producer2.start();
        producer3.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();
    }
}
