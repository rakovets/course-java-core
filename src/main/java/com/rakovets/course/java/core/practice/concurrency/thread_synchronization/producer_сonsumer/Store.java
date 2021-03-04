package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_сonsumer;

import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

import java.util.LinkedList;
import java.util.Random;

public class Store {
    private final int SIZE_STORE = 10;
    private LinkedList<Integer> lsStore;

    public Store() {
        lsStore = new LinkedList<>();
    }

    synchronized public void produce() {
        Random random = new Random();
        try {
            while (lsStore.size() > SIZE_STORE) {
                wait();
            }
            lsStore.add(random.nextInt());
            StandardOutputUtil.println("Input one element", AnsiColorCode.FG_RED);
            StandardOutputUtil.println("Storage: " + lsStore.size(), AnsiColorCode.BG_GREEN);
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void consume() {
        Random random = new Random();
        try {
            while (lsStore.size() < 1) {
                wait();
            }
            Thread.sleep(random.nextInt(10));
            lsStore.removeFirst();
            StandardOutputUtil.println("Output one element", AnsiColorCode.FG_BLUE);
            StandardOutputUtil.println("Storage: " + lsStore.size(), AnsiColorCode.BG_GREEN);
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
