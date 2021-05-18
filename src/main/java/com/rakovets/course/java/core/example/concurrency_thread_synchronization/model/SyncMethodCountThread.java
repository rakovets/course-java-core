package com.rakovets.course.java.core.example.concurrency_thread_synchronization.model;

public class SyncMethodCountThread implements Runnable {
    private final SyncMethodCommonResource res;

    public SyncMethodCountThread(SyncMethodCommonResource res) {
        this.res = res;
    }

    public void run() {
        res.increment();
    }
}
