package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.service;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.repository.ProductRepository;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer.view.StoreViewConsole;

import java.util.Random;

public class StoreService {
    public static final int STORE_SIZE;
    private static final StoreViewConsole storeViewConsole;

    static {

        STORE_SIZE = 10;
        storeViewConsole = new StoreViewConsole();

    }

    public synchronized void produce() {
        while (ProductRepository.size() == STORE_SIZE) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (ProductRepository.size() < STORE_SIZE) {
            ProductRepository.add(new Random().nextInt());
            storeViewConsole.produceView();

        }
        notify();
    }

    public synchronized void consume() {
        while (ProductRepository.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ProductRepository.removeFirst();
        storeViewConsole.consumeView();
        notify();
    }
}
