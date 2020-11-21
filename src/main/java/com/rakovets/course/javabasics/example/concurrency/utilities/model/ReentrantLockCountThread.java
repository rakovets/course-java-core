package com.rakovets.course.javabasics.example.concurrency.utilities.model;

import com.rakovets.course.javabasics.util.AnsiColorCode;

import java.util.concurrent.locks.ReentrantLock;

import static com.rakovets.course.javabasics.util.StandardOutputUtil.printlnWithTimeAndThread;

public class ReentrantLockCountThread implements Runnable {
    private final CommonResource res;
    private final ReentrantLock lock;

    public ReentrantLockCountThread(CommonResource res, ReentrantLock lock) {
        this.res = res;
        this.lock = lock;
    }

    public void run() {
        lock.lock();
        try {
            AnsiColorCode randomColor = AnsiColorCode.getRandom();
            for (int i = 1; i <= 4; i++) {
                printlnWithTimeAndThread(res.x, randomColor);
                res.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            lock.unlock();
        }
    }
}
