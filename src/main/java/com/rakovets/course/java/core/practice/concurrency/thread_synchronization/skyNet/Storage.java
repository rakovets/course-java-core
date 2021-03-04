package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

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
        while (days < 2) {
            if (storage.isEmpty()) {
                for (int i = 0; i < 10; i++) {
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
            } else {
                days++;
                notifyAll();
                wait();
            }
        }
    }

    public synchronized List<Details> getDetails() throws InterruptedException {
        List<Details> detailsList = new LinkedList<>();
        int counter = 0;
        while (days < 2) {
            while (storage.isEmpty() || counter == 5) {
                wait();
                counter = 0;
            }
            for ( ; counter < 5; counter++) {
                detailsList.add(storage.remove(0));
            }
            notifyAll();
            }
        return detailsList;
        }

}
