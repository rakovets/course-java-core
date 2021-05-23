package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

import java.util.LinkedList;
import java.util.Random;

public class Store {
    private LinkedList<Integer> storeList;
    private final int capacity = 10;
    private boolean iaAlive = true;

    public Store() {
        this.storeList =new LinkedList<>();
    }

    public LinkedList<Integer> getStoreList() {
        return storeList;
    }

    public void setStoreList(LinkedList<Integer> storeList) {
        this.storeList = storeList;
    }

    public synchronized void produce() {
        while (iaAlive) {
            while (storeList.size() >= capacity) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            int addNumber = new Random().nextInt();
            storeList.add(addNumber);
            System.out.println("Number" + addNumber +  " was added " + Thread.currentThread().getName());
            System.out.println("Store size: " + storeList.size());
            notifyAll();
        }
    }

    public synchronized void consume() {
        while (iaAlive) {
            try {
                while(storeList.isEmpty()) {
                    System.out.println("Store empty");
                    wait();
                }
                int remove = storeList.removeFirst();
                System.out.println(Thread.currentThread().getName() + " delete " + remove);
                System.out.println("Store size: " + storeList.size());
            }
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void endOfExchange() {
        iaAlive = false;
    }
}
