package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Store storeOfIntegerNumbers = new Store(10);
        Thread producer1 = new Thread(new ProducerThread(storeOfIntegerNumbers, 10), "Producer1");
        Thread producer2 = new Thread(new ProducerThread(storeOfIntegerNumbers, 20), "Producer2");
        Thread consumer1 = new Thread(new ConsumerThread(storeOfIntegerNumbers), "Consumer1");
        Thread consumer2 = new Thread(new ConsumerThread(storeOfIntegerNumbers), "Consumer2");

        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
    }
}
