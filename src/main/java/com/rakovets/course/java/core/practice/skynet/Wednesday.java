package com.rakovets.course.java.core.practice.skynet;

public class Wednesday extends Thread {
    private Storage storage;

    public Wednesday(Storage storage) {
        this.storage = storage;
    }

    public void run() {
        storage.getDetail();
    }
}
