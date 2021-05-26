package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class StoreDemo {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);

        new Thread(consumer).start();
        new Thread(producer).start();
        new Thread(consumer).start();
        new Thread(producer).start();
        new Thread(producer).start();
    }
}
