package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShoppingCart {
    private final List<Product> shoppingCart = new ArrayList<>();
    private final ProductStorage products = new ProductStorage();

    public List<Product> getShoppingCart() {
        for (int i = 0; i < new Random().nextInt(4) + 1; i++) {
            shoppingCart.add(products.get(new Random().nextInt(products.getSize())));
        }
        return shoppingCart;
    }
}
