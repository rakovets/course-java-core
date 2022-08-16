package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Store storeOfIntegerNumbers = new Store();
        Thread producer1 = new Thread(new ProducerThread(storeOfIntegerNumbers), "Producer1");
        Thread producer2 = new Thread(new ProducerThread(storeOfIntegerNumbers), "Producer2");
        Thread producer3 = new Thread(new ProducerThread(storeOfIntegerNumbers), "Producer3");
        Thread producer4 = new Thread(new ProducerThread(storeOfIntegerNumbers), "Producer4");
        Thread consumer1 = new Thread(new ConsumerThread(storeOfIntegerNumbers), "Consumer1");
        Thread consumer2 = new Thread(new ConsumerThread(storeOfIntegerNumbers), "Consumer2");
        producer1.start();
        producer2.start();
        producer3.start();
        producer4.start();
        consumer1.start();
        consumer2.start();
    }
}
