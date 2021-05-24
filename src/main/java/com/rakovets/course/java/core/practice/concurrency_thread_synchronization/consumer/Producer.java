package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.consumer;

public class Producer extends Thread{
    private store store;

    public Producer(String name, store store){
        super(name);
        this.store = store;
    }

    @Override
    public void run() {
        try {
            store.produce();

        }
        catch (InterruptedException e){
            e.getStackTrace();
        }
    }
}
