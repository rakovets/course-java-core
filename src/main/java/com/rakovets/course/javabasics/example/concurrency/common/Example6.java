package com.rakovets.course.javabasics.example.concurrency.common;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

public class Example6 {
    public static void main(String[] args) {
        StandardOutputUtil.printlnWithTime(Thread.currentThread().getName() + " thread : started", AnsiColorCode.FG_RED_BOLD);
        Runnable lambda = () -> {
            StandardOutputUtil.printlnWithTime(Thread.currentThread().getName() + ": started", AnsiColorCode.FG_BLUE_BOLD);
            StandardOutputUtil.printlnWithTime(Thread.currentThread().getName() + ": finished", AnsiColorCode.FG_BLUE_BOLD);
        };
        Thread thread = new Thread(lambda);
        thread.start();
        Thread thread2 = new Thread(lambda, "Lambda");
        thread2.start();
        StandardOutputUtil.printlnWithTime(Thread.currentThread().getName() + " thread: finished", AnsiColorCode.FG_RED_BOLD);
    }
}
