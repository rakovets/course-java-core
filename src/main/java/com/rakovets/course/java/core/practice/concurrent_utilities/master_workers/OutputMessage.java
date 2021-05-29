package com.rakovets.course.java.core.practice.concurrent_utilities.master_workers;

import java.time.LocalDateTime;

public abstract class OutputMessage {
    public static void startThreadMessage(Thread thread) {
        System.out.println(LocalDateTime.now() + " " + thread.getName() + " start work");
    }

    public static void endThreadMessage(Thread thread) {
        System.out.println(LocalDateTime.now() + " " + thread.getName() + " end work");
    }

    public static void workingInProgress(Thread thread) {
        System.out.println(thread.getName() + " working...\n");
    }
}
