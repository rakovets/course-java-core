package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.service;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.model.Product;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.view.ShoppingCartViewConsole;

import java.util.List;

public class CustomerService implements Runnable {
    private final StoreService storeService;
    private final ShoppingCartViewConsole shoppingCartViewConsole = new ShoppingCartViewConsole();

    public CustomerService(StoreService storeService) {
        this.storeService = storeService;
        shoppingCartViewConsole.shoppingCartView();
    }

    public void run() {
        storeService.consume(this);
    }

    public List<Product> getShoppingList() {
        return shoppingCartViewConsole.shoppingList;
    }

    public String getCustomer() {
        return shoppingCartViewConsole.customer;
    }
}
