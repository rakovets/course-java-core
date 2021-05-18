package com.rakovets.course.java.core.example.concurrency_thread_synchronization.model;

import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

public class CountThread implements Runnable {
    private final CommonResource res;

    public CountThread(CommonResource res) {
        this.res = res;
    }

    public void run() {
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
