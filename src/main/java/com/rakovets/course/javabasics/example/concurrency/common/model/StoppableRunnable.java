package com.rakovets.course.javabasics.example.concurrency.common.model;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

public class StoppableRunnable implements Stoppable, Runnable {
    private boolean isRun = true;

    @Override
    public void run() {
        StandardOutputUtil.printlnWithTimeAndThread("started", AnsiColorCode.FG_BLUE_BOLD);

        while (isRun) {
            try {
                StandardOutputUtil.printlnWithTimeAndThread("...", AnsiColorCode.FG_BLUE_BOLD);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        StandardOutputUtil.printlnWithTimeAndThread("finished", AnsiColorCode.FG_BLUE_BOLD);
    }

    @Override
    public void stop() {
        isRun = false;
    }
}
