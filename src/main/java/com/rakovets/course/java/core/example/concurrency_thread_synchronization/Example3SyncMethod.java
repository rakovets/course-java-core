package com.rakovets.course.java.core.example.concurrency_thread_synchronization;

import com.rakovets.course.java.core.example.concurrency_thread_synchronization.model.SyncMethodCommonResource;
import com.rakovets.course.java.core.example.concurrency_thread_synchronization.model.SyncMethodCountThread;

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
