package com.rakovets.course.java.core.example.concurrent_utilities;

import com.rakovets.course.java.core.example.concurrent_utilities.model.Consumer;
import com.rakovets.course.java.core.example.concurrent_utilities.model.Producer;
import com.rakovets.course.java.core.example.concurrent_utilities.model.Store;

public class Example4ReentrantLockCondition {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
