package com.rakovets.course.javabasics.example.concurrency.threadsynchronization;

import com.rakovets.course.javabasics.example.concurrency.threadsynchronization.model.ColorThread;
import com.rakovets.course.javabasics.util.AnsiColorCode;

public class RaceConditionExample {
    public static void main(String[] args) {
        Thread redThread = new ColorThread(AnsiColorCode.FG_RED_BOLD);
        Thread blueThread = new ColorThread(AnsiColorCode.FG_BLUE_BOLD);

        redThread.start();
        blueThread.start();

        try {
            redThread.join();
            blueThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("THE END");
    }
}
