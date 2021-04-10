package com.rakovets.course.java.core.example.concurrency;

import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

public class Example9_1 {
    public static void main(String[] args) {
        StandardOutputUtil.printlnWithTimeAndThread("started", AnsiColorCode.FG_RED_BOLD);

        Runnable runnable = () -> {
            while (true) {
                StandardOutputUtil.printlnWithTimeAndThread("...", AnsiColorCode.FG_BLUE_BOLD);
                sleep(1);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        sleep(5);

        StandardOutputUtil.printlnWithTimeAndThread("finished", AnsiColorCode.FG_RED_BOLD);
    }

    private static void sleep(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
