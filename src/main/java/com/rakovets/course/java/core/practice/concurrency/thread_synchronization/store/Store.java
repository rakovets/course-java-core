package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.view.StoreView;

import java.util.Random;

public class Store {
    private final Cashiers cashiers = new Cashiers();
    public int cashier = new Random().nextInt(cashiers.getSize());

    public void consume(CustomerThread customerThread) {
        synchronized (cashiers.get(cashier)) {
            StoreView.cashiersServed(customerThread);
        }
    }
}
