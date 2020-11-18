package com.rakovets.course.javabasics.example.concurrency.common;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

public class Example7 {
    public static void main(String[] args) {
        StandardOutputUtil.printlnWithTimeAndThread("started", AnsiColorCode.FG_RED_BOLD);
        Runnable lambda = () -> {
            StandardOutputUtil.printlnWithTimeAndThread("started", AnsiColorCode.FG_BLUE_BOLD);

            try {
                StandardOutputUtil.printlnWithTimeAndThread("sleep", AnsiColorCode.FG_BLUE_BOLD);
                Thread.sleep(5 * 1000);
                StandardOutputUtil.printlnWithTimeAndThread("wake up", AnsiColorCode.FG_BLUE_BOLD);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            StandardOutputUtil.printlnWithTimeAndThread("finished", AnsiColorCode.FG_BLUE_BOLD);
        };
        Thread thread = new Thread(lambda);
        thread.start();
        StandardOutputUtil.printlnWithTimeAndThread("finished", AnsiColorCode.FG_RED_BOLD);
    }
}
