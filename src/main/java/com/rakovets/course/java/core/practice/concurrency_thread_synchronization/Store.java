package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

public class Store {
    private static final Random random = new Random();
    private static Deque<Integer> listOfNumbers = new LinkedList<>();
    private final static int STORAGE_CAPACITY = 10;

    public synchronized void produce() {
        while (listOfNumbers.size() == STORAGE_CAPACITY) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int element = random.nextInt(50);
        listOfNumbers.add(element);
        System.out.println("Added element: " + element + "\nStorage size: " + getStorageSize() + "\n" + getListOfNumbers());
        notify();
    }

    public synchronized void consume() {
        while (listOfNumbers.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int element = listOfNumbers.removeFirst();
        System.out.println("Received element: " + element + "\nStorage size: " + getStorageSize() + "\n" + getListOfNumbers());
        notify();
    }

    public int getStorageSize() {
        return listOfNumbers.size();
    }

    public Deque<Integer> getListOfNumbers() {
        return listOfNumbers;
    }
}
