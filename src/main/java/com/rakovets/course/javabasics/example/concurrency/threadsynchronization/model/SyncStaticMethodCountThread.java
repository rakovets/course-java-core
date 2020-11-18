package com.rakovets.course.javabasics.example.concurrency.threadsynchronization.model;

public class SyncStaticMethodCountThread implements Runnable {
    public void run() {
        SyncStaticMethodCommonResource.increment();
    }
}
