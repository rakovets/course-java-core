package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

public class Consumer extends Thread {
    private Store store;

    public Consumer(String name, Store store){
        super(name);
        this.store = store;
    }
    public void run() {
        while (true) {
            store.consume();
        }
    }
}
