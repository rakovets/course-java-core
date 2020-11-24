package com.rakovets.course.javabasics.example.concurrency.model;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

public class PrintThread extends Thread {

    @Override
    public void run() {
        int count = 0;
        while(count < 100 ){
            count++;
        }
        StandardOutputUtil.printlnWithTime("PrintThread: started", AnsiColorCode.FG_BLUE_BOLD);
        StandardOutputUtil.printlnWithTime("PrintThread: finished", AnsiColorCode.FG_BLUE_BOLD );
        StandardOutputUtil.println( "Count = " + count );


    }
}
