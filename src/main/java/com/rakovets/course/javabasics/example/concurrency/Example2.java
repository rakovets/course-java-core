package com.rakovets.course.javabasics.example.concurrency;

import com.rakovets.course.javabasics.example.concurrency.model.PrintThread;
import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

public class Example2 {
    public static void main(String[] args) {
        StandardOutputUtil.printlnWithTime("Main thread: started", AnsiColorCode.FG_RED_BOLD);
        Thread thread = new PrintThread();
        thread.start();
        StandardOutputUtil.printlnWithTime("Main thread: finished", AnsiColorCode.FG_RED_BOLD);
    }
}
