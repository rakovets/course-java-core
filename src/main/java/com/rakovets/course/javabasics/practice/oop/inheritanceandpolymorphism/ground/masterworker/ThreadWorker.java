package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.masterworker;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

public class ThreadWorker extends Thread {
    private SharedResource shared;
    public ThreadWorker (SharedResource shared){
        this.shared = shared;
    }

    @Override
    public void run() {

        while (true) {
            try {
                Integer number =  shared.queueNumbers.poll();
                if (number == null) {
                    if(shared.isFinished){
                        break;
                    }
                    System.out.println("...");
                    sleep(1000);
                } else {
                    sleep(number * 1000);
                    StandardOutputUtil.printlnWithTimeAndThread("I slept "+ number * 1000 +" seconds");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        StandardOutputUtil.printlnWithTimeAndThread("Worker thread is finished", AnsiColorCode.FG_RED_BOLD);
    }
}
