package com.rakovets.course.java.core.example.concurrency;

import com.rakovets.course.java.core.example.concurrency.model.StoppableRunnable;
import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

public class Example8 {
    public static void main(String[] args) {
        StandardOutputUtil.printlnWithTimeAndThread("started", AnsiColorCode.FG_RED_BOLD);

        StoppableRunnable stoppableRunnable = new StoppableRunnable();
        Thread thread = new Thread(stoppableRunnable, "StoppableRunnable");
        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        StandardOutputUtil.printlnWithTimeAndThread("stop StoppableRunnable", AnsiColorCode.FG_RED_BOLD);
        stoppableRunnable.stop();
        StandardOutputUtil.printlnWithTimeAndThread("finished", AnsiColorCode.FG_RED_BOLD);
    }
}
