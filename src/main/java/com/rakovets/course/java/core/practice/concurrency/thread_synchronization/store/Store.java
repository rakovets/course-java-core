package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store;

import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

import java.util.Random;

public class Store {
    Cashiers cashiers = new Cashiers();

    public void consume(CustomerThread customerThread) {
        int cashier = new Random().nextInt(cashiers.getSize());
        synchronized (cashiers.get(cashier)) {
            StandardOutputUtil.println(cashiers.get(cashier) + " served " +
                    customerThread.getCustomer(), AnsiColorCode.FG_RED_BOLD);
            for(Product product : customerThread.getShoppingList()) {
                StandardOutputUtil.println(cashiers.get(cashier) + " checked out " +
                        product, AnsiColorCode.FG_BLACK_BOLD_BRIGHT);
            }
        }
    }
}
