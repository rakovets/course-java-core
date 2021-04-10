package com.rakovets.course.java.core.example.concurrency_thread_synchronization;

import com.rakovets.course.java.core.example.concurrency_thread_synchronization.model.Consumer;
import com.rakovets.course.java.core.example.concurrency_thread_synchronization.model.Producer;
import com.rakovets.course.java.core.example.concurrency_thread_synchronization.model.Store;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

