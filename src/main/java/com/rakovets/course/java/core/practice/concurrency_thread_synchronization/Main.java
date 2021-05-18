package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Store store = new Store();
        Producer producer = new Producer("producer1", store);
        Consumer consumer = new Consumer("consumer1", store);
        Thread threadProducer = new Thread(producer);
        Thread threadConsumer = new Thread(consumer);
        threadProducer.start();
        threadConsumer.start();
    }
}
