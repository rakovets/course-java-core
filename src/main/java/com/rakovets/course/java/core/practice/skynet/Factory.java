package com.rakovets.course.java.core.practice.skynet;

public class Factory extends Thread {
    private Storage storage;

    public Factory(Storage storage) {
        this.storage = storage;
    }

    public void run() {
        storage.produce();
    }
}
