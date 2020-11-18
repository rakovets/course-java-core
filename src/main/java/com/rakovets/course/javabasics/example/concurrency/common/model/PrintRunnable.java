package com.rakovets.course.javabasics.example.concurrency.common.model;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

public class PrintRunnable implements Runnable {
    @Override
    public void run() {
        StandardOutputUtil.printlnWithTime("PrintRunnable: started", AnsiColorCode.FG_YELLOW_BOLD);
        StandardOutputUtil.printlnWithTime("PrintRunnable: finished", AnsiColorCode.FG_YELLOW_BOLD);
    }
}
