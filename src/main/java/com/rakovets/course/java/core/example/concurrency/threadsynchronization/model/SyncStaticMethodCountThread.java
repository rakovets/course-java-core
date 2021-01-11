package com.rakovets.course.java.core.example.concurrency.threadsynchronization.model;

public class SyncStaticMethodCountThread implements Runnable {
    public void run() {
        SyncStaticMethodCommonResource.increment();
    }
}
