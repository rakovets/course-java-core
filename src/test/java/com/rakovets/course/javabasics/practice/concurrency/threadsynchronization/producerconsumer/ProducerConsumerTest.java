package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producerconsumer;

public class ProducerConsumerTest {
    public static void main(String[] args) {
        Store s = new Store();
        ProducerThread p = new ProducerThread(s);
        ConsumerThread c = new ConsumerThread(s);
        new Thread(p).start();
        new Thread(c).start();
    }
}
