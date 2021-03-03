package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.producer_consumer;

import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

import java.util.LinkedList;
import java.util.Random;

public class Store {
    private final LinkedList<Integer> storeList;
    private boolean isWorking;

    public Store() {
        this.storeList = new LinkedList<>();
        this.isWorking = true;
    }

    public synchronized void produce() {
        AnsiColorCode randomColor = AnsiColorCode.getRandom();
        Random random = new Random();
        int length = 10;
        while (isWorking) {
            while (this.storeList.size() >= length) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            storeList.add(random.nextInt());
            StandardOutputUtil.println("Producer: Item was added " + Thread.currentThread().getName(), randomColor);
            StandardOutputUtil.println("Storage size: " + this.storeList.size(), randomColor);
            notifyAll();
        }
    }

    public synchronized void consume() {
        AnsiColorCode randomColor = AnsiColorCode.getRandom();
        while (isWorking) {
            try {
                while (storeList.isEmpty()) {
                    StandardOutputUtil.println("Consumer: Store is empty " + Thread.currentThread().getName(), randomColor);
                    wait();
                }
                Integer result = storeList.removeFirst();
                StandardOutputUtil.println(result, randomColor);
                StandardOutputUtil.println("Storage size: " + this.storeList.size() + " " + Thread.currentThread().getName(), randomColor);
                notifyAll();
                wait(new Random().nextInt(11));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }
}
