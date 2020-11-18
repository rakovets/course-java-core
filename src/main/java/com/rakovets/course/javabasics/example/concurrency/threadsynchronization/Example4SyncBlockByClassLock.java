package com.rakovets.course.javabasics.example.concurrency.threadsynchronization;

import com.rakovets.course.javabasics.example.concurrency.threadsynchronization.model.CommonResource;
import com.rakovets.course.javabasics.example.concurrency.threadsynchronization.model.SyncBlockCountThread;

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
