package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.repository;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.model.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductStorageRepository {
    private final Map<Integer, Product> productStorage = new HashMap<>();

    public ProductStorageRepository() {
        productStorage.put(0, Product.VEGETABLES);
        productStorage.put(1, Product.FRUITS);
        productStorage.put(2, Product.BREAD);
        productStorage.put(3, Product.MILK);
        productStorage.put(4, Product.EGGS);
        productStorage.put(5, Product.JUICE);
        productStorage.put(6, Product.WATER);
        productStorage.put(7, Product.MEAT);
        productStorage.put(8, Product.CHEESE);
        productStorage.put(9, Product.FISH);
    }

    public int getSize() {
        return productStorage.size();
    }

    public Product get(int value) {
        return productStorage.get(value);
    }
}
