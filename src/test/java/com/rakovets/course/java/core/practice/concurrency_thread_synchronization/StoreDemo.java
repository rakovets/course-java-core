package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class StoreDemo {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);

        new Thread(producer, "First producer").start();
        new Thread(producer, "Second producer").start();
        new Thread(producer, "Third producer").start();
        new Thread(consumer, "First consumer").start();
        new Thread(consumer, "Second consumer").start();
        new Thread(consumer, "Third consumer").start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        store.endOfRun();
    }
}
