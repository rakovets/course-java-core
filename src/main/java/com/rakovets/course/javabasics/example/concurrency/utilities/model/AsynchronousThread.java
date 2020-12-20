package com.rakovets.course.javabasics.example.concurrency.utilities.model;

import com.rakovets.course.javabasics.util.AnsiColorCode;

import static com.rakovets.course.javabasics.util.StandardOutputUtil.printlnWithTimeAndThread;

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
