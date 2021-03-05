package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.view.ShoppingCartView;

import java.util.List;

public class CustomerThread implements Runnable {
    private final Store store;
    private final ShoppingCartView shoppingCartView = new ShoppingCartView();

    public CustomerThread(Store store) {
        this.store = store;
        shoppingCartView.shoppingCartView();
    }

    public void run() {
        store.consume(this);
    }

    public List<Product> getShoppingList() {
        return shoppingCartView.shoppingList;
    }

    public String getCustomer() {
        return shoppingCartView.customer;
    }
}
