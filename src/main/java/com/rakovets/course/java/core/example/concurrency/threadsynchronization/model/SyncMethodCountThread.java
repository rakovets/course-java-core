package com.rakovets.course.java.core.example.concurrency.threadsynchronization.model;

public class SyncMethodCountThread implements Runnable {
    private final SyncMethodCommonResource res;

    public SyncMethodCountThread(SyncMethodCommonResource res) {
        this.res = res;
    }

    public void run() {
        res.increment();
    }
}
