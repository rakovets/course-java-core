package com.rakovets.course.javabasics.example.concurrency.utilities.model;

import com.rakovets.course.javabasics.util.AnsiColorCode;

import java.util.concurrent.locks.Lock;

import static com.rakovets.course.javabasics.util.StandardOutputUtil.printlnWithTimeAndThread;

public class ReentrantLockCountImprThread implements Runnable {
    private final CommonResource res;
    private final Lock lock;

    public ReentrantLockCountImprThread(CommonResource res, Lock lock) {
        this.res = res;
        this.lock = lock;
    }

    public void run() {
        AnsiColorCode randomColor = AnsiColorCode.getRandom();
        for (int i = 1; i <= 4; i++) {
            lock.lock();
            int previousX = res.x++;
            printlnWithTimeAndThread(previousX + " -> " + res.x, randomColor);
            lock.unlock();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
