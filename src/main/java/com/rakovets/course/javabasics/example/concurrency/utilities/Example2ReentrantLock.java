package com.rakovets.course.javabasics.example.concurrency.utilities;

import com.rakovets.course.javabasics.example.concurrency.utilities.model.CommonResource;
import com.rakovets.course.javabasics.example.concurrency.utilities.model.ReentrantLockCountThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example2ReentrantLock {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        Lock locker = new ReentrantLock();
        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(new ReentrantLockCountThread(commonResource, locker));
            t.setName("Thread " + i);
            t.start();
        }
    }
}
