package com.rakovets.course.javabasics.example.concurrency.threadsynchronization.model;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

public class SyncStaticMethodCommonResource {
    private static int x;

    synchronized static void increment() {
        AnsiColorCode randomColor = AnsiColorCode.getRandom();
        for (int i = 1; i < 5; i++) {
            StandardOutputUtil.printlnWithTimeAndThread(x, randomColor);
            x++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
