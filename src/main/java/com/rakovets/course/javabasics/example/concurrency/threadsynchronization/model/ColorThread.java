package com.rakovets.course.javabasics.example.concurrency.threadsynchronization.model;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

public class ColorThread extends Thread {
    private static int index = 0;
    private final AnsiColorCode color;

    public ColorThread(AnsiColorCode color) {
        this.color = color;
    }

    @Override
    public void run() {
        int internalIndex = 0;
        while (index < 2000) {
            internalIndex++;
            StandardOutputUtil.printlnWithTimeAndThread(++index, color);
            try {
                Thread.sleep(7);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        StandardOutputUtil.printlnWithTimeAndThread("Internal index: " + internalIndex, color);
    }
}
