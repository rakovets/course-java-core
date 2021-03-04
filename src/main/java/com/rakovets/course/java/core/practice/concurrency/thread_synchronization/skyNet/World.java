package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet;

import java.util.List;

public class World extends Thread {
    private List<Details> detailsList;
    private Storage storage;

    public World(List<Details> detailsList, Storage storage) {
        this.detailsList = detailsList;
        this.storage = storage;
    }

    public List<Details> getDetailsList() {
        return detailsList;
    }

    @Override
    public void run() {
        try {
            detailsList.addAll(storage.getDetails());
            System.out.println("word" + detailsList.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
