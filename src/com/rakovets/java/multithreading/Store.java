package com.rakovets.java.multithreading;

import java.util.LinkedList;
import java.util.Random;

public class Store {
    private LinkedList<Integer> list = new LinkedList<>();
    private Random random = new Random();
    private int maxCapacity = 10;

    public void produce() {
        while (true) {
            synchronized (this) {
                if (list.size() < maxCapacity) {
                    int newValue = random.nextInt(100);
                    list.add(newValue);
                    System.out.println(newValue + " added to the list " + list);
                    notify();
                }
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                if (list.size() > 0) {
                    int val = list.removeFirst();
                    System.out.println(val + " was removed from list");
                    Thread.sleep(random.nextInt(1000));
                    notify();
                }
            }
        }
    }
}
