package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer.threads.ConsumeThread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer.threads.ProducerThread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer.Store;

public class NumberStorageDemo {
    public static void main(String[] args) {
        Store store = new Store();
        Thread producer = new Thread(new ProducerThread(store), "Producer");
        Thread consumer = new Thread(new ConsumeThread(store), "Consumer");
        producer.start();
        consumer.start();
    }
}
