package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producerConsumer;

import java.util.LinkedList;

public class Store {
    private LinkedList<Integer> store;
    private boolean isActive;

    public Store(LinkedList<Integer> store) {
        this.store = store;
        this.isActive = true;
    }

    public synchronized void produce() {
        int number;
        while (isActive) {
            while (this.store.size() >= 10) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            number = (int)(Math.random() * 1000);
            store.add(number);
            System.out.printf("%s, Number %d added, Storage size: %d\n", Thread.currentThread().getName(), number, store.size());
            notifyAll();
        }
    }

    public synchronized void consume() {
        while (isActive) {
            try {
                while (store.isEmpty()) {
                    System.out.println("Storage is empty " + Thread.currentThread().getName());
                    wait();
                }
                wait((int)(Math.random() * 10));
                Integer first = store.removeFirst();
                System.out.printf("%s, Remove: %d, Storage size: %d\n", Thread.currentThread().getName(), first, store.size());
                notifyAll();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void isActive(boolean value) {
        isActive = value;
    }
}
