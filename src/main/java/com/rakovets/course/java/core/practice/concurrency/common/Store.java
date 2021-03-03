package com.rakovets.course.java.core.practice.concurrency.common;

import java.util.LinkedList;
import java.util.Random;

public class Store extends Thread {
    public LinkedList storeList;
    private final int OVERSIZE = 10;
    private boolean online = true;
    private LinkedList allTaken;

    public Store() {
    }

    public synchronized void produce() {
        while (online) {
            while (storeList.size() < OVERSIZE) {
                Random random = new Random();
                storeList.add(random.nextInt());
                System.out.println("Number + " + Thread.currentThread().getName());
                System.out.println("Store size: " + storeList.size());
                notifyAll();
            }
            try {
                wait();
            } catch (InterruptedException n) {
                n.printStackTrace();
            }
        }
    }

    public synchronized void consume() {
        while (online) {
            while (storeList.size() <= 0) {
                try {
                    Random randomTime = new Random(11);
                    Thread.sleep(randomTime.nextInt());

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                allTaken.add((int) storeList.removeFirst());
                System.out.println("Number - " + storeList.removeFirst());
                System.out.println("Store size: " + storeList.size() + " " + Thread.currentThread().getName());
                notifyAll();

            }
        }

    }
    public void setOnlineOn(boolean onlineOn) {
        online = onlineOn;
    }
}
