package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Customer {
    private List<StoreGoods> purchases;

    public Customer(List<StoreGoods> purchases) {
        this.purchases = purchases;
    }
    
    public static Customer generate(int quantityOfGoods) {
        Random random = new Random();
        List<StoreGoods> purchases = new LinkedList<>();
        Customer customer = new Customer(purchases);
        for (int x = 0; x < quantityOfGoods; x++) {
            int purchaseDeterminer = random.nextInt(6);
            switch (purchaseDeterminer) {
                case 0:
                    purchases.add(StoreGoods.ZELDA);
                    break;
                case 1:
                    purchases.add(StoreGoods.WITCHER);
                    break;
                case 2:
                    purchases.add(StoreGoods.POKEMON);
                    break;
                case 3:
                    purchases.add(StoreGoods.DIABLO);
                    break;
                case 4:
                    purchases.add(StoreGoods.MARIO);
                    break;
                case 5:
                    purchases.add(StoreGoods.BAYONETTA);
                    break;
            }
        }
        return customer;
    }

    public List<StoreGoods> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<StoreGoods> purchases) {
        this.purchases = purchases;
    }
}
