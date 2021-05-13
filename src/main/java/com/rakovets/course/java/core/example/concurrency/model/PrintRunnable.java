package com.rakovets.course.java.core.example.concurrency.model;

import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

public class PrintRunnable implements Runnable {
    @Override
    public void run() {
        StandardOutputUtil.printlnWithTime("PrintRunnable: started", AnsiColorCode.FG_YELLOW_BOLD);
        StandardOutputUtil.printlnWithTime("PrintRunnable: finished", AnsiColorCode.FG_YELLOW_BOLD);
    }
}
