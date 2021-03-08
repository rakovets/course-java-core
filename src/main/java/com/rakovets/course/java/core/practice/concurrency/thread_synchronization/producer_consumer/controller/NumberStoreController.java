package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.controller;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.service.ConsumerService;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.service.ProducerService;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.service.StoreService;

public class NumberStoreController {
    private static final StoreService storeService;

    static {

        storeService = new StoreService();

    }

    public void start() {
        new Thread(new ProducerService(storeService)).start();
        new Thread(new ConsumerService(storeService)).start();
    }
}
