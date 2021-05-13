package com.rakovets.course.java.core.example.concurrency.model;

import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

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
