package com.rakovets.course.java.core.example.concurrency_thread_synchronization;

import com.rakovets.course.java.core.example.concurrency_thread_synchronization.model.SyncStaticMethodCountThread;

public class Example5SyncStaticMethod {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            Thread t = new Thread(new SyncStaticMethodCountThread());
            t.setName("Thread " + i);
            t.start();
        }
    }
}
