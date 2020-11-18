package com.rakovets.course.javabasics.example.concurrency.threadsynchronization.model;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

public class SyncBlockCountThread implements Runnable {
    private final CommonResource res;

    public SyncBlockCountThread(CommonResource res) {
        this.res = res;
    }

    public void run() {
        synchronized (res) {
            AnsiColorCode randomColor = AnsiColorCode.getRandom();
            for (int i = 1; i < 5; i++) {
                StandardOutputUtil.printlnWithTimeAndThread(res.x, randomColor);
                res.x++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
