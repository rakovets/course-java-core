package com.rakovets.course.javabasics.example.concurrency.common;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

public class Example1 {
    public static void main(String[] args) {
        StandardOutputUtil.printlnWithTime("Main thread: started", AnsiColorCode.FG_RED_BOLD);
        Thread thread = new Thread();
        thread.start();
        StandardOutputUtil.printlnWithTime("Main thread: finished", AnsiColorCode.FG_RED_BOLD);
    }
}
