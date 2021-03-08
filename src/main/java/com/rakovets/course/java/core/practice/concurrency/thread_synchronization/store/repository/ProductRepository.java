package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.repository;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.model.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository {
    private static final Map<Integer, Product> products;

    static {

        products = new HashMap<>();

    }

    public ProductRepository() {
        products.put(0, Product.VEGETABLES);
        products.put(1, Product.FRUITS);
        products.put(2, Product.BREAD);
        products.put(3, Product.MILK);
        products.put(4, Product.EGGS);
        products.put(5, Product.JUICE);
        products.put(6, Product.WATER);
        products.put(7, Product.MEAT);
        products.put(8, Product.CHEESE);
        products.put(9, Product.FISH);
    }

    public int getSize() {
        return products.size();
    }

    public Product get(int value) {
        return products.get(value);
    }
}
