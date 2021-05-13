package com.rakovets.course.java.core.example.concurrency.model;

import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

public class InfinityRunnable implements Runnable {
    @Override
    public void run() {
        StandardOutputUtil.printlnWithTimeAndThread("started", AnsiColorCode.FG_BLUE_BOLD);
        while (true) {
            try {
                StandardOutputUtil.printlnWithTimeAndThread("...", AnsiColorCode.FG_BLUE_BOLD);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
