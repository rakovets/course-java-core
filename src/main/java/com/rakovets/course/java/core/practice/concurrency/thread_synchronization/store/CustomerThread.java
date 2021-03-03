package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store;

import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

import java.util.List;

public class CustomerThread implements Runnable {
    private final Store store;
    private final List<Product> shoppingList;
    private static int numberOfCustomer;
    private final String customer;
    public ShoppingCart shoppingCart = new ShoppingCart();

    public CustomerThread(Store store) {
        this.store = store;
        numberOfCustomer++;
        customer = "CUSTOMER_" + numberOfCustomer;
        shoppingList = shoppingCart.getShoppingCart();
        StandardOutputUtil.println(customer + " shopping cart:", AnsiColorCode.FG_GREEN_BOLD);
        for(Product product : shoppingList) {
            StandardOutputUtil.println(product, AnsiColorCode.FG_BLUE_BOLD_BRIGHT);
        }
    }

    public void run() {
        store.consume(this);
    }

    public List<Product> getShoppingList() {
        return shoppingList;
    }

    public String getCustomer() {
        return customer;
    }
}
