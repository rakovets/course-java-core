package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.controller;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.service.CustomerService;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.service.StoreService;

public class StoreController {
    private static final int numberOfCustomers;
    private final CustomerService[] customerService = new CustomerService[numberOfCustomers];
    private final StoreService storeService = new StoreService();

    static {

        numberOfCustomers = 10;

    }

    public void start() {
        for (int i = 0; i < numberOfCustomers; i++) {
            customerService[i] = new CustomerService(storeService);
            new Thread(customerService[i]).start();
        }
    }
}
