package com.rakovets.course.javabasics.example.concurrency.common;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

public class Example5 {
    public static void main(String[] args) {
        StandardOutputUtil.printlnWithTime("Main thread: started", AnsiColorCode.FG_RED_BOLD);
        Runnable lambda = () -> {
            StandardOutputUtil.printlnWithTime("Lambda: started", AnsiColorCode.FG_BLUE_BOLD);
            StandardOutputUtil.printlnWithTime("Lambda: finished", AnsiColorCode.FG_BLUE_BOLD);
        };
        Thread thread = new Thread(lambda);
        thread.start();
        StandardOutputUtil.printlnWithTime("Main thread: finished", AnsiColorCode.FG_RED_BOLD);
    }
}
