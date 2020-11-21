package com.rakovets.course.javabasics.example.concurrency.utilities.model;

import com.rakovets.course.javabasics.util.AnsiColorCode;

import static com.rakovets.course.javabasics.util.StandardOutputUtil.printlnWithTimeAndThread;

public class AsynchronousThread implements Runnable {
    public void run() {
        printlnWithTimeAndThread("Asynchronous task ", AnsiColorCode.FG_BLUE_BOLD);
    }
}
