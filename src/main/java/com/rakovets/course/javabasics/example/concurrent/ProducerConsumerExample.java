package com.rakovets.course.javabasics.example.concurrent;

import com.rakovets.course.javabasics.example.concurrent.model.Consumer;
import com.rakovets.course.javabasics.example.concurrent.model.Producer;
import com.rakovets.course.javabasics.example.concurrent.model.Store;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

