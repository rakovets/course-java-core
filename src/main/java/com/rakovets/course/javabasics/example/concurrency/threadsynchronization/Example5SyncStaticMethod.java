package com.rakovets.course.javabasics.example.concurrency.threadsynchronization;

import com.rakovets.course.javabasics.example.concurrency.threadsynchronization.model.SyncStaticMethodCountThread;

public class Example5SyncStaticMethod {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            Thread t = new Thread(new SyncStaticMethodCountThread());
            t.setName("Thread " + i);
            t.start();
        }
    }
}
