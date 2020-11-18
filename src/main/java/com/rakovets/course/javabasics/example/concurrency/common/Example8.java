package com.rakovets.course.javabasics.example.concurrency.common;

import com.rakovets.course.javabasics.example.concurrency.common.model.StoppableRunnable;
import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

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
