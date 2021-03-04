package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.view.StoreView;

import java.util.Random;

public class Store {
    protected final int SIZE = 10;

    public synchronized void produce() {
        while (ProductList.size() == SIZE) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (ProductList.size() < SIZE) {
            ProductList.add(new Random().nextInt());
            StoreView.produceView();

        }
        notify();
    }

    public synchronized void consume() {
        while (ProductList.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ProductList.removeFirst();
        StoreView.consumeView();
        notify();
    }
}
