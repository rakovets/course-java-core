package com.rakovets.course.javabasics.example.concurrency.threadsynchronization;

import com.rakovets.course.javabasics.example.concurrency.threadsynchronization.model.SyncMethodCommonResource;
import com.rakovets.course.javabasics.example.concurrency.threadsynchronization.model.SyncMethodCountThread;

public class Example3SyncMethod {
    public static void main(String[] args) {
        SyncMethodCommonResource syncMethodCommonResource = new SyncMethodCommonResource();
        for (int i = 1; i < 6; i++) {
            Thread t = new Thread(new SyncMethodCountThread(syncMethodCommonResource));
            t.setName("Thread " + i);
            t.start();
        }
    }
}
