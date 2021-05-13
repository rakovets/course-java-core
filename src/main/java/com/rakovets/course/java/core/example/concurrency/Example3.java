package com.rakovets.course.java.core.example.concurrency;

import com.rakovets.course.java.core.example.concurrency.model.PrintRunnable;
import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

public class Example3 {
    public static void main(String[] args) {
        StandardOutputUtil.printlnWithTime("Main thread: started", AnsiColorCode.FG_RED_BOLD);
        Runnable printRunnable = new PrintRunnable();
        Thread thread = new Thread(printRunnable);
        thread.start();
        StandardOutputUtil.printlnWithTime("Main thread: finished", AnsiColorCode.FG_RED_BOLD);
    }
}
