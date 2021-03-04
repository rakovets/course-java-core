package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skyNet;

public class Factory extends Thread {
    private Storage storage;

    public Factory(Storage storage) {
        this.storage = storage;
    }

    public Storage getStorage() {
        return storage;
    }

    @Override
    public void run() {
        try {
            storage.produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
