package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producerConsumer;

import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;
import java.util.LinkedList;

public class Store {
    private LinkedList<Integer> store;
    private boolean isActive;

    public Store(LinkedList<Integer> store) {
        this.store = store;
        this.isActive = true;
    }

    public synchronized void produce() {
        while (isActive) {
            while (this.store.size() >= 10) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            store.add((int)(Math.random() * 1000));
            StandardOutputUtil.println("Number added. " + Thread.currentThread().getName(), AnsiColorCode.BG_BLUE_BRIGHT);
            StandardOutputUtil.println("Storage size: " + this.store.size(), AnsiColorCode.BG_BLUE_BRIGHT);
            notifyAll();
        }
    }

    public synchronized void consume() {
        while (isActive) {
            try {
                while (store.isEmpty()) {
                    StandardOutputUtil.println("Consumer: Store is empty " + Thread.currentThread().getName(), AnsiColorCode.FG_GREEN_BOLD_BRIGHT);
                    wait();
                }
                Integer first = store.removeFirst();
                StandardOutputUtil.println("remove " + first, AnsiColorCode.FG_YELLOW_BOLD_BRIGHT);
                StandardOutputUtil.println("Storage size: " + this.store.size() + " " + Thread.currentThread().getName(), AnsiColorCode.FG_YELLOW_BOLD_BRIGHT);
                notifyAll();
                wait((int)(Math.random() * 10));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void isActive(boolean working) {
        isActive = working;
    }
}
