package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class StoreDemo {
    public static void main(String[] args) {
        Store store = new Store();

        Thread killer = new Thread(new KillerProducerAndConsumer(store),"Killer");
        Thread producer = new Thread(new ProducerThread(store),"ProducerThread");
        Thread producer1 = new Thread(new ProducerThread(store),"ProducerThread1");
        Thread producer2 = new Thread(new ProducerThread(store),"ProducerThread2");
        Thread consumer1 = new Thread(new ConsumerThread(store),"ConsumerThread1");
        Thread consumer2 = new Thread(new ConsumerThread(store),"ConsumerThread2");
        Thread consumer3 = new Thread(new ConsumerThread(store),"ConsumerThread3");

        killer.start();
        producer.start();
        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();
    }
}
