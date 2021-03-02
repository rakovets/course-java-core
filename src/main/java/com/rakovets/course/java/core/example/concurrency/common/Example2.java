package com.rakovets.course.java.core.example.concurrency.common;

import com.rakovets.course.java.core.example.concurrency.common.model.PrintThread;
import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

public class Example2 {
    public static void main(String[] args) {
        StandardOutputUtil.printlnWithTime("Main thread: started", AnsiColorCode.FG_RED_BOLD);
        Thread thread = new PrintThread();
        thread.start();
        StandardOutputUtil.printlnWithTime("Main thread: finished", AnsiColorCode.FG_RED_BOLD);
    }
}
