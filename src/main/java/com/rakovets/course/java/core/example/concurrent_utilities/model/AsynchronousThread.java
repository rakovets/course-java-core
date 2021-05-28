package com.rakovets.course.java.core.example.concurrent_utilities.model;

import com.rakovets.course.java.core.util.AnsiColorCode;

import static com.rakovets.course.java.core.util.StandardOutputUtil.printlnWithTimeAndThread;

public class AsynchronousThread implements Runnable {
    public void run() {
        printlnWithTimeAndThread("Start: asynchronous task", AnsiColorCode.FG_BLUE_BOLD);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printlnWithTimeAndThread("Finish: asynchronous task", AnsiColorCode.FG_BLUE_BOLD);
    }
}
