package com.rakovets.course.javabasics.example.concurrency.common;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

public class Example4 {
    public static void main(String[] args) {
        StandardOutputUtil.printlnWithTime("Main thread: started", AnsiColorCode.FG_RED_BOLD);
        Runnable anonymousRunnable = new Runnable() {
            @Override
            public void run() {
                StandardOutputUtil.printlnWithTime("AnonymousRunnable: started", AnsiColorCode.FG_BLUE_BOLD);
                StandardOutputUtil.printlnWithTime("AnonymousRunnable: finished", AnsiColorCode.FG_BLUE_BOLD);
            }
        };
        Thread thread = new Thread(anonymousRunnable);
        thread.start();
        StandardOutputUtil.printlnWithTime("Main thread: finished", AnsiColorCode.FG_RED_BOLD);
    }
}
