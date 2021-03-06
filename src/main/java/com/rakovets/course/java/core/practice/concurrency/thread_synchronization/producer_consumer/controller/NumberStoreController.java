package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.controller;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.service.ConsumerThreadService;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.service.ProducerThreadService;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.service.StoreService;

public class NumberStoreController {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        new Thread(new ProducerThreadService(storeService)).start();
        new Thread(new ConsumerThreadService(storeService)).start();
    }
}
