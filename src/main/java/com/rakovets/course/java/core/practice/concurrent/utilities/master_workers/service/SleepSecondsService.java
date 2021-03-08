package com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.service;

import java.util.concurrent.Callable;

public class SleepSecondsService implements Callable<Object> {
    public int numberOfSeconds;

    public SleepSecondsService(int numberOfSeconds) {
        this.numberOfSeconds = numberOfSeconds;
    }

    public Object call() {
        if (numberOfSeconds > 0) {
            sleep(numberOfSeconds * 1000);
        }
        return null;
    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
