package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Store {
    private int number;
    int storageCapacity = 10;
    private Random random = new Random();
    boolean isRun = true;
    private Queue<Integer> store = new LinkedList<>();

    public Store() {
        this.store = store;
    }

    public Queue<Integer> getStore() {
        return store;
    }

    public synchronized void produce() {
        Integer numberInteger;
        while (isRun) {
            while (store.size() >= storageCapacity) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            number = random.nextInt(100);
            numberInteger = number;
            store.add(numberInteger);
            System.out.println(Thread.currentThread().getName() + " was added number: " + number + ".");
            System.out.println("Store size: " + store.size() + ".");
            notify();
        }
    }

    public synchronized void consume() {
        while (isRun) {
            while (store.size() < 1) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            int removeNumber = store.remove();
            System.out.println(Thread.currentThread().getName() + " remove number: " + removeNumber + ".");
            System.out.println("Store size: " + store.size() + ".");
            notify();
        }
    }

    public void isIsRun() {
        isRun = false;
    }
}
