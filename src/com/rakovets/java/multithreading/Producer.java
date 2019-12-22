package com.rakovets.java.multithreading;

public class Producer implements Runnable {
    Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.produce();
    }
}
