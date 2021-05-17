package com.rakovets.course.java.core.practice.concurrency;

public class OutputMessages {
    public static void startThreadMessage(Thread thread) {
        System.out.println(thread.getName() + " start work");
    }

    public static void endThreadMessage(Thread thread) {
        System.out.println(thread.getName() + " end work");
    }

    public static void sleepMessage(Thread thread, int seconds) {
        System.out.println(thread.getName() + " fell asleep for " + seconds + " seconds");
    }

    public static void awakeMessage(Thread thread) {
        System.out.println(thread.getName() + " awake");
    }
}
