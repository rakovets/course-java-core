package com.rakovets.course.java.core.example.concurrency;

import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

public class Example9_2 {
    public static void main(String[] args) {
        StandardOutputUtil.printlnWithTimeAndThread("started", AnsiColorCode.FG_RED_BOLD);

        Runnable runnable = () -> {
            while (true) {
                StandardOutputUtil.printlnWithTimeAndThread("...", AnsiColorCode.FG_BLUE_BOLD);
                sleep(1000);
            }
        };
        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
        thread2.start();

        sleep(5000);

        StandardOutputUtil.printlnWithTimeAndThread("finished", AnsiColorCode.FG_RED_BOLD);
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
