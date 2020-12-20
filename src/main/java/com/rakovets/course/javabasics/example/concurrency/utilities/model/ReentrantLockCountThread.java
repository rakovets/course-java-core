package com.rakovets.course.javabasics.example.concurrency.utilities.model;

import com.rakovets.course.javabasics.util.AnsiColorCode;

import java.util.concurrent.locks.Lock;

import static com.rakovets.course.javabasics.util.StandardOutputUtil.printlnWithTimeAndThread;

public class ReentrantLockCountThread implements Runnable {
    private final CommonResource res;
    private final Lock lock;

    public ReentrantLockCountThread(CommonResource res, Lock lock) {
        this.res = res;
        this.lock = lock;
    }

    public void run() {
        lock.lock();
        try {
            AnsiColorCode randomColor = AnsiColorCode.getRandom();
            for (int i = 1; i <= 4; i++) {
                int previousX = res.x++;
                printlnWithTimeAndThread(previousX + " -> " + res.x, randomColor);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            lock.unlock();
        }
    }
}
