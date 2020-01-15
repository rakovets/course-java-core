package com.rakovets.java.multithreading.producer_consumer;

import java.util.LinkedList;
import java.util.Random;

public class Store {
    Random random = new Random();
    LinkedList<Integer> listWithValues = new LinkedList<>();

    public synchronized void produce() {
        while (listWithValues.size() > 9) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        listWithValues.addFirst(random.nextInt(100));
        System.out.printf("Value %d is added. Size of store is %d\n\n", listWithValues.getFirst(), listWithValues.size());
        notify();
    }

    public synchronized void consume() {
        while (listWithValues.size() < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            Thread.sleep(random.nextInt(10));
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.printf("%d element was deleted. Size of store is %d.\n\n", listWithValues.getFirst(), (listWithValues.size() - 1));
        listWithValues.removeFirst();
        notify();
    }
}
