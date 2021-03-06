package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.controller;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.service.CustomerThreadService;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.service.StoreService;

public class StoreController {
    private final int numberOfCustomers = 10;
    private final CustomerThreadService[] customerThreadService = new CustomerThreadService[numberOfCustomers];
    private final StoreService storeService = new StoreService();

    public void start() {
        for (int i = 0; i < numberOfCustomers; i++) {
            customerThreadService[i] = new CustomerThreadService(storeService);
            new Thread(customerThreadService[i]).start();
        }
    }
}
