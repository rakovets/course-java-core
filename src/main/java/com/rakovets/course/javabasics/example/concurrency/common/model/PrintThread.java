package com.rakovets.course.javabasics.example.concurrency.common.model;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

public class PrintThread extends Thread {
    @Override
    public void run() {
        StandardOutputUtil.printlnWithTime("PrintThread: started", AnsiColorCode.FG_BLUE_BOLD);
        StandardOutputUtil.printlnWithTime("PrintThread: finished", AnsiColorCode.FG_BLUE_BOLD);
    }
}
