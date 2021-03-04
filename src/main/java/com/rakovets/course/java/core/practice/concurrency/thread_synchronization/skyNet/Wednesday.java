package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet;

import java.util.Map;

public class Wednesday extends Thread {
    private Map<Details, Integer> detailsList;
    private Storage storage;

    public Wednesday(Map<Details, Integer> detailsList, Storage storage) {
        this.detailsList = detailsList;
        this.storage = storage;
    }

    @Override
    public void run() {
        try {
            System.out.println(storage.getDetails());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
