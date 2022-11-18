package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.store.ConsumerThread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.store.ProducerThread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.store.Store;

import java.util.Arrays;

public class StoreDemo {
    public static void main(String[] args) throws InterruptedException {
        Store store = new Store(10);

        Thread producerThread = new Thread(new ProducerThread(store), " (Producer)");
        Thread producerThread1 = new Thread(new ProducerThread(store), " (Producer1)");
        Thread producerThread2 = new Thread(new ProducerThread(store), " (Producer2)");

        Thread consumerThread = new Thread(new ConsumerThread(store), " (Consumer)");
        Thread consumerThread1 = new Thread(new ConsumerThread(store), " (Consumer1)");
        Thread consumerThread2 = new Thread(new ConsumerThread(store), " (Consumer2)");

        Arrays.asList(consumerThread, consumerThread1, consumerThread2, producerThread, producerThread1, producerThread2)
                .forEach(Thread::start);

        for (Thread thread : Arrays.asList(consumerThread, consumerThread1, consumerThread2, producerThread, producerThread1, producerThread2)) {
            thread.join();
        }
    }
}
