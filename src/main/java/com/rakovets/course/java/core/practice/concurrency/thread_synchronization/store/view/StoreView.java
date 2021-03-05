package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.view;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.Cashiers;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.CustomerThread;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.Product;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.Store;
import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

public class StoreView {

    public static void cashiersServed(CustomerThread customerThread) {
        Store store = new Store();
        Cashiers cashiers = new Cashiers();
        StandardOutputUtil.println(cashiers.get(store.cashier) + " served " +
                customerThread.getCustomer(), AnsiColorCode.FG_RED_BOLD);
        for (Product product : customerThread.getShoppingList()) {
            StandardOutputUtil.println(cashiers.get(store.cashier) + " checked out " +
                    product, AnsiColorCode.FG_BLACK_BOLD_BRIGHT);
        }
    }
}
