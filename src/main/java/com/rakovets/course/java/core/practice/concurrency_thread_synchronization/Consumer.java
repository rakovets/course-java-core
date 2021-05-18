package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class Consumer extends Thread {
    private Store store;

    public Consumer(String name, Store store){
        super(name);
        this.store = store;
    }
    public void run(Store store) {
        while (true) {
            store.consume();
        }
    }
}
