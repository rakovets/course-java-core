package com.rakovets.course.java.core.example.concurrency_thread_synchronization;

import com.rakovets.course.java.core.example.concurrency_thread_synchronization.model.CommonResource;
import com.rakovets.course.java.core.example.concurrency_thread_synchronization.model.SyncBlockCountThread;

public class Example4SyncBlockByClassLock {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        for (int i = 1; i < 6; i++) {
            Thread t = new Thread(new SyncBlockCountThread(commonResource));
            t.setName("Thread " + i);
            t.start();
        }
    }
}
