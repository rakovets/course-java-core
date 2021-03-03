package com.rakovets.course.java.core.practice.concurrency.thread_synchronization;

import java.util.*;

public class Store {
    private static List<Integer> storage = new LinkedList<>();
    private boolean isWorking = true;
    private final int max = 10;

        public synchronized void produce() {
        while (isWorking) {
            while (storage.size() >= max) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            storage.add(new Random().nextInt());
            notifyAll();
        }
    }

        public synchronized void consume()  {
            while (storage.isEmpty()) {
                System.out.println("The store is empty");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Integer result = storage.remove(0);
            notifyAll();
            try {
                Thread.sleep(new Random().nextInt(10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    public void setInterruption(boolean b) {
            isWorking = b;
    }
}
