package com.rakovets.course.java.core.practice.skynet;

import java.util.*;

public class Storage {
    private Deque<Detail> storage;
    private boolean working;
    private int days;

    public Storage() {
        this.storage = new LinkedList<>();
        this.working = true;
        this.days = 0;
    }

    public synchronized void produce() {
        Random random = new Random();
        while (days < 30) {
            while (storage.isEmpty()) {
                for (int i = 0; i < random.nextInt(10); i++) {
                    int randomDetail = random.nextInt(4);
                    switch (randomDetail) {
                        case 0:
                            storage.addLast(Detail.head);
                            break;
                        case 1:
                            storage.addLast(Detail.torso);
                            break;
                        case 2:
                            storage.addLast(Detail.hand);
                            break;
                        case 3:
                            storage.addLast(Detail.feet);
                            break;
                    }
                }
                days++;
                notify();
            }
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notifyAll();
    }

    public synchronized Map<Detail, Integer> getDetail() {
        Map<Detail, Integer> details = new HashMap<>();
        while (days < 30) {
            while (storage.isEmpty()) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
