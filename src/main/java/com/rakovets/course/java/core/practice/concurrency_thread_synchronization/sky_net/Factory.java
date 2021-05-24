package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

public class Factory {
    Storage storage;

    public Factory(Storage storage) {
        this.storage = storage;
    }

    public synchronized void factoryStartWork() {
        storage.produceParts();
    }
}
