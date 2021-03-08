package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.repository;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.model.Cashier;

import java.util.HashMap;
import java.util.Map;

public class CashiersRepository {
    private static final Map<Integer, Cashier> cashiers;

    static {

        cashiers = new HashMap<>();

    }

    public CashiersRepository() {
        cashiers.put(0, Cashier.CASHIER_1);
        cashiers.put(1, Cashier.CASHIER_2);
        cashiers.put(2, Cashier.CASHIER_3);
        cashiers.put(3, Cashier.CASHIER_4);
    }

    public int getSize() {
        return cashiers.size();
    }

    public Cashier get(int value) {
        return cashiers.get(value);
    }
}
