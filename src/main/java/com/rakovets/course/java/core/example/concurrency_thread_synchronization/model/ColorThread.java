package com.rakovets.course.java.core.example.concurrency_thread_synchronization.model;

import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

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
