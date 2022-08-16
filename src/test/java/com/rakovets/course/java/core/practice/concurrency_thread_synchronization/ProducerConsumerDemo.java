package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.produce_consumer.ConsumerThread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.produce_consumer.ProducerTread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.produce_consumer.Store;

public class ProducerConsumerDemo {
    public static void main(String[] args) throws InterruptedException {
        Store store = new Store(10);

        Thread consumerThread = new Thread(new ConsumerThread(store), "consumer thread 0");
        Thread consumerThread1 = new Thread(new ConsumerThread(store), "consumer thread 1");
        Thread consumerThread2 = new Thread(new ConsumerThread(store), "consumer thread 2");

        Thread producerThread = new Thread(new ProducerTread(store), "producer thread 0");
        Thread producerThread1 = new Thread(new ProducerTread(store), "producer thread 1");
        Thread producerThread2 = new Thread(new ProducerTread(store), "producer thread 2");

        consumerThread.start();
        consumerThread1.start();
        consumerThread2.start();
        producerThread.start();
        producerThread1.start();
        producerThread2.start();

        consumerThread.join();
        consumerThread1.join();
        consumerThread2.join();

        producerThread.join();
        producerThread1.join();
        producerThread2.join();
    }
}
