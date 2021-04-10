package com.rakovets.course.java.core.example.concurrent_utilities.model;

import com.rakovets.course.java.core.util.AnsiColorCode;

import static com.rakovets.course.java.core.util.StandardOutputUtil.printlnWithTimeAndThread;

public class CountThread implements Runnable {
    private final CommonResource res;

    public CountThread(CommonResource res) {
        this.res = res;
    }

    public void run() {
        AnsiColorCode randomColor = AnsiColorCode.getRandom();
        for (int i = 1; i <= 4; i++) {
            int previousX = res.x++;
            printlnWithTimeAndThread(previousX + " -> " + res.x, randomColor);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
