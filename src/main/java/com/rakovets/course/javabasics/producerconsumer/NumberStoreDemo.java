package com.rakovets.course.javabasics.producerconsumer;

import com.rakovets.course.javabasics.example.concurrency.threadsynchronization.model.Store;

public class NumberStoreDemo {
    public static void main(String[] args) throws InterruptedException {
        // Object of a class that has both produce()
        // and consume() methods
        final Store store = new Store();

        // Create producer thread
        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                store.produce();
            }
        });

        // Create consumer thread
        Thread сonsumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                store.consume();
            }
        });

        // Start both threads
        producerThread.start();
        сonsumerThread.start();

        // t1 finishes before t2
        producerThread.join();
        сonsumerThread.join();
    }

}
