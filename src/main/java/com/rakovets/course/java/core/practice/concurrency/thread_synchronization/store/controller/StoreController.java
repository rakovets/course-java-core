package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.controller;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.service.CustomerService;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.service.StoreService;

public class StoreController {
    private static final int numberOfCustomers;
    private static final CustomerService[] customerService;
    private static final StoreService storeService;

    static {

        numberOfCustomers = 10;
        customerService = new CustomerService[numberOfCustomers];
        storeService = new StoreService();

    }

    public void start() {
        for (int i = 0; i < numberOfCustomers; i++) {
            customerService[i] = new CustomerService(storeService);
            new Thread(customerService[i]).start();
        }
    }
}
