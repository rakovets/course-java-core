package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.LinkedList;
import java.util.Random;

public class Store {
    private LinkedList<Integer> linkedList;
    private boolean isWorking  = true;
    private final int capacity = 10;

    public synchronized void produce() {
        while (isWorking) {
            while (linkedList.size() >= capacity) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }

            linkedList.add(new Random().nextInt());
            System.out.println("Number was added " + Thread.currentThread().getName());
            System.out.println("Store size: " + linkedList.size());
            notifyAll();
        }
    }

    public synchronized void consume() {
        while (isWorking) {
            try {
                while (linkedList.isEmpty()) {
                    System.out.println("Store is empty! " + Thread.currentThread().getName());
                    wait();
                }
                Integer result = linkedList.removeFirst();
                System.out.println("The digit that was extracted " + result);
                System.out.println("Store size: " + linkedList.size() + " " + Thread.currentThread().getName());
                notifyAll();
                Thread.sleep(1000L);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void setInterruption(boolean param) {
        isWorking = param;
    }

    public Store() {
        this.linkedList = new LinkedList<>();
    }

    public LinkedList<Integer> getStore() {
        return linkedList;
    }

    public void setStore(LinkedList<Integer> store) {
        this.linkedList = store;
    }

    public int getCapacity() {
        return capacity;
    }
}














