package com.rakovets.course.java.core.example.concurrency_thread_synchronization;

import com.rakovets.course.java.core.example.concurrency_thread_synchronization.model.ColorThread;
import com.rakovets.course.java.core.util.AnsiColorCode;

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
