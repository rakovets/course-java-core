package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skyNet;

public class Factory implements Runnable {
    private Storage storage;

    public Factory(Storage storage) {
        this.storage = storage;
    }

    @Override
    public  void run() {
        while (storage.getStatus())
        for (int i = 1; i <= storage.getLimitDays(); i++) {
            storage.makeRobotParts();
        }
    }
}
