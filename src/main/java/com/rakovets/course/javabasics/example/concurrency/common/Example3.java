package com.rakovets.course.javabasics.example.concurrency.common;

import com.rakovets.course.javabasics.example.concurrency.common.model.PrintRunnable;
import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

public class Example3 {
    public static void main(String[] args) {
        StandardOutputUtil.printlnWithTime("Main thread: started", AnsiColorCode.FG_RED_BOLD);
        Runnable printRunnable = new PrintRunnable();
        Thread thread = new Thread(printRunnable);
        thread.start();
        StandardOutputUtil.printlnWithTime("Main thread: finished", AnsiColorCode.FG_RED_BOLD);
    }
}
