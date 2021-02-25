package com.rakovets.course.java.core.example.concurrency.thread_synchronization.model;

public class SyncStaticMethodCountThread implements Runnable {
    public void run() {
        SyncStaticMethodCommonResource.increment();
    }
}
