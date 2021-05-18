package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public class Producer extends Thread{
    private Store store;

    public Producer(String name, Store store){
        super(name);
        this.store = store;
    }

    public void run() {
        while (true) {
            store.produce();
        }
    }
}
