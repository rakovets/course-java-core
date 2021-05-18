package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

public class Store {
    private static final Random random = new Random();
    static Deque<Integer> listOfNumbers = new LinkedList<>();
    private final static int STORAGE_CAPACITY = 10;

    synchronized public void produce() {
        while (listOfNumbers.size() >= STORAGE_CAPACITY) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        listOfNumbers.add(random.nextInt(100));
        notify();
    }

    public int consume() {
        while (listOfNumbers.size() < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int element = listOfNumbers.element();
        listOfNumbers.removeFirst();
        notify();
        return element;
    }

    public static Deque<Integer> getListOfNumbers() {
        return listOfNumbers;
    }
}
