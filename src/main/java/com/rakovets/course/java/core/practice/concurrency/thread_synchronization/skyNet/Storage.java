package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet;

import java.util.*;

public class Storage {
    private List<Details> storage;
    private boolean areWorking;
    private int days;

    public Storage(List<Details> storage) {
        this.storage = storage;
        this.areWorking = true;
        this.days = 0;
    }

    public synchronized void produce() throws InterruptedException {
        Random random = new Random();
        while (days < 20) {
            while (storage.isEmpty()) {
                for (int i = 0; i < random.nextInt(10); i++) {
                    int randomOfDetails = random.nextInt(4);
                    switch (randomOfDetails) {
                        case 0:
                            storage.add(Details.HEAD);
                            break;
                        case 1:
                            storage.add(Details.TORSO);
                            break;
                        case 2:
                            storage.add(Details.HAND);
                            break;
                        case 3:
                            storage.add(Details.FEET);
                            break;
                    }
                }
                days++;
                notifyAll();
            }
            wait();
        }
        notifyAll();
    }

    public synchronized Map<Details, Integer> getDetails() throws InterruptedException {
        Map<Details, Integer> detailsMap = new HashMap<>();
        while (days < 20) {
            while (storage.isEmpty()) {
                wait();
            }
            if (detailsMap.containsKey(storage.get(0))) {
                detailsMap.put(storage.get(0), detailsMap.get(storage.get(0)) + 1);
                storage.remove(0);
            } else {
                detailsMap.put(storage.get(0), 1);
                storage.remove(0);
            }
            if (storage.isEmpty()) {
                notifyAll();
            }
        }
        notifyAll();
        return detailsMap;
    }
}
