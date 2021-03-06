package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.service;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.repository.ProductListRepository;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.view.StoreViewConsole;

import java.util.Random;

public class StoreService {
    protected final int SIZE = 10;
    private final StoreViewConsole storeViewConsole = new StoreViewConsole();

    public synchronized void produce() {
        while (ProductListRepository.size() == SIZE) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (ProductListRepository.size() < SIZE) {
            ProductListRepository.add(new Random().nextInt());
            storeViewConsole.produceView();

        }
        notify();
    }

    public synchronized void consume() {
        while (ProductListRepository.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ProductListRepository.removeFirst();
        storeViewConsole.consumeView();
        notify();
    }
}
