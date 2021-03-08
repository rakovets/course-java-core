package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.repository;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShoppingCartRepository {
    private final List<Product> shoppingCart = new ArrayList<>();
    private static final ProductRepository products;

    static {

        products = new ProductRepository();

    }

    public List<Product> getShoppingCart() {
        for (int i = 0; i < new Random().nextInt(4) + 1; i++) {
            shoppingCart.add(products.get(new Random().nextInt(products.getSize())));
        }
        return shoppingCart;
    }
}
