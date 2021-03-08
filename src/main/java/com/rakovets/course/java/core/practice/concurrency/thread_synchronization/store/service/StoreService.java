package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.service;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.repository.CashiersRepository;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.view.StoreViewConsole;

import java.util.Random;

public class StoreService {
    private static final CashiersRepository cashiersRepository;
    public int cashier = new Random().nextInt(cashiersRepository.getSize());
    private static final StoreViewConsole storeViewConsole;

    static {

        cashiersRepository = new CashiersRepository();
        storeViewConsole = new StoreViewConsole();

    }

    public void consume(CustomerService customerService) {
        synchronized (cashiersRepository.get(cashier)) {
            storeViewConsole.cashiersServed(customerService);
        }
    }
}
