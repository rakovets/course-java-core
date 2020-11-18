package com.rakovets.course.javabasics.example.concurrency.threadsynchronization;

import com.rakovets.course.javabasics.example.concurrency.threadsynchronization.model.Consumer;
import com.rakovets.course.javabasics.example.concurrency.threadsynchronization.model.Producer;
import com.rakovets.course.javabasics.example.concurrency.threadsynchronization.model.Store;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

