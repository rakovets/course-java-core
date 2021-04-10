package com.rakovets.course.java.core.example.concurrency.model;

import com.rakovets.course.java.core.util.AnsiColorCode;
import com.rakovets.course.java.core.util.StandardOutputUtil;

public class PrintThread extends Thread {
    @Override
    public void run() {
        StandardOutputUtil.printlnWithTime("PrintThread: started", AnsiColorCode.FG_BLUE_BOLD);
        StandardOutputUtil.printlnWithTime("PrintThread: finished", AnsiColorCode.FG_BLUE_BOLD);
    }
}
