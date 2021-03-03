package com.rakovets.course.java.core.practice.concurrency.thread_synchronization;

import java.util.LinkedList;
import java.util.Random;

public class Store {
    private LinkedList<Integer> store;
    private boolean isWorking  = true;
    private final int capacity = 10;

    public synchronized void produce() {
        while (isWorking) {
            while (store.size() >= capacity) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }

            store.add(new Random().nextInt());
            System.out.println("Number was added " + Thread.currentThread().getName());
            System.out.println("Store size: " + store.size());
            notifyAll();
        }
    }

    public synchronized void consume() {
        while (isWorking) {
            try {
                while (store.isEmpty()) {
                    System.out.println("Store is empty! " + Thread.currentThread().getName());
                    wait();
                }
                Integer result = store.removeFirst();
                System.out.println("The digit that was extracted " + result);
                System.out.println("Store size: " + store.size() + " " + Thread.currentThread().getName());
                notifyAll();
                Thread.sleep(11);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void setInterruption(boolean param) {
        isWorking = param;
    }

    public Store() {
        this.store = new LinkedList<>();
    }

    public LinkedList<Integer> getStore() {
        return store;
    }

    public void setStore(LinkedList<Integer> store) {
        this.store = store;
    }

    public int getCapacity() {
        return capacity;
    }
}
