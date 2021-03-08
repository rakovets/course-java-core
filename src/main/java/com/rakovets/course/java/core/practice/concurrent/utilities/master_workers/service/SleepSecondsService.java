package com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.service;

import java.util.concurrent.Callable;

public class SleepSecondsService implements Callable<Object> {
    public int numberOfSeconds;

    public SleepSecondsService(int numberOfSeconds) {
        this.numberOfSeconds = numberOfSeconds;
    }

    public Object call() {
        sleep();
        return null;
    }

    private static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
