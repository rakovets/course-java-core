package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

public class Factory implements Runnable {
    private Store store;

    public Factory(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i <= store.getNumberOfDays(); i++) {
            store.makeDetails();
        }
    }
}
