package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.consumer;

public class Consumer extends Thread{
    private store store;

    public Consumer(String name, store store){
        super(name);
        this.store = store;
    }

    @Override
    public void run() {
        try {
            store.consume();
        }
        catch (InterruptedException e){
            e.getStackTrace();
        }
    }
}

