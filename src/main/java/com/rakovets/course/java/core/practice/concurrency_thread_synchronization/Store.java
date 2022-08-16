package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.LinkedList;
import java.util.Queue;

public class Store {
    private final int STORE_SIZE = 10;

    private Queue<Integer> integerNumbersQueue = new LinkedList<>();

    public void produce(int number) {
        if (isFull()) {
            System.out.println(Thread.currentThread().getName() + ", store is full!");
        } else {
            integerNumbersQueue.offer(number);
        }
    }

    public synchronized int consume() {
        return integerNumbersQueue.poll();
    }

    public boolean isFull() {
        return integerNumbersQueue.size() == STORE_SIZE;
    }
}
