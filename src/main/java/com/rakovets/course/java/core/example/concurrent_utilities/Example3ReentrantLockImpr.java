package com.rakovets.course.java.core.example.concurrent_utilities;

import com.rakovets.course.java.core.example.concurrent_utilities.model.CommonResource;
import com.rakovets.course.java.core.example.concurrent_utilities.model.ReentrantLockCountImprThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example3ReentrantLockImpr {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        Lock locker = new ReentrantLock();
        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(new ReentrantLockCountImprThread(commonResource, locker));
            t.setName("Thread " + i);
            t.start();
        }
    }
}
