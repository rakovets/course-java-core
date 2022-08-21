package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

import java.util.LinkedList;
import java.util.Queue;

public class Store {
    private final int storeSize;
    private final Queue<Integer> integerNumbersQueue = new LinkedList<>();

    public Store(int storeSize) {
        this.storeSize = storeSize;
    }

    public synchronized void produce(int number) {
        while (integerNumbersQueue.size() == storeSize) {
            System.out.println(Thread.currentThread().getName() + ", store is full!");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notify();
        integerNumbersQueue.offer(number);
    }

    public synchronized int consume() {
        while (integerNumbersQueue.isEmpty()) {
            System.out.println(Thread.currentThread().getName() + ", store is empty!");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notify();
        return integerNumbersQueue.poll();
    }
}
