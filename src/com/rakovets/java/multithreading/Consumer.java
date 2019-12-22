package com.rakovets.java.multithreading;

public class Consumer extends Thread {
    Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        try {
            store.consume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
