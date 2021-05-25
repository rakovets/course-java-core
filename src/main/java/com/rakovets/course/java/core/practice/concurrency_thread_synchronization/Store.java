package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

import java.util.LinkedList;
import java.util.Random;

public class Store {
    private LinkedList<Integer> store;
    private int maxStoreSize = 9;
    private boolean isAlive = true;

    public Store() {
        this.store = new LinkedList<Integer>();
    }

    public boolean getStatus() {
        return isAlive ;
    }

    public synchronized void produce (int number) {
        Integer numberIntegerType = number;
        if (store.size() > maxStoreSize) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
        store.add(numberIntegerType);
        StandardOutputUtil.printlnWithTimeAndThread("Number" + number + "was added to store", AnsiColorCode.FG_RED_BOLD);
        StandardOutputUtil.printlnWithTimeAndThread("Total products in the Store: " + store.size(), AnsiColorCode.FG_BLUE_BOLD);
        notifyAll();
        }
    }

    public synchronized void consume() {
        if (store.size() == 0) {
            try {
                System.out.println("Cosnumer is waiting");
                Thread.sleep(5000);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            store.poll();
            StandardOutputUtil.printlnWithTimeAndThread("Consumer got 1 product from the Store.", AnsiColorCode.FG_RED_BOLD);
            StandardOutputUtil.printlnWithTimeAndThread("Total products in the Store: " + store.size(), AnsiColorCode.FG_BLUE_BOLD);
            notifyAll();
        }
    }

    public void kill() {
        isAlive = false;
    }
}


