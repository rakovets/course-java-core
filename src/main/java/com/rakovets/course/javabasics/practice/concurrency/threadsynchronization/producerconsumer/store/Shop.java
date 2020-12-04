package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.producerconsumer.store;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shop {
    private final String[] products = {"Eggs", "Pork", "Onion", "Tomato", "Cucumber", "Milk", "Butter", "Becon"};
    private final Integer[] cashBox = {1, 2, 3};

    public void buy(Customer customers) {
        int number1 = new Random().nextInt(cashBox.length);
        synchronized (cashBox[number1]) {
            System.out.println("PiggyBank" + cashBox[number1] + " serves " + customers.getName());
            for(String product : customers.getList()) {
                System.out.println("PiggyBank" + cashBox[number1] + " released " + product);
            }
        }
    }

    public List<String> getListOfProducts() {
        List<String> list = new ArrayList<>();
        int max = 10;
        int amountOfProducts = new Random().nextInt(max) + 1;
        for (int i = 0; i < amountOfProducts; i++) {
            int numberOfProduct = new Random().nextInt(products.length);
            list.add(products[numberOfProduct]);
        }
        return list;
    }
}
