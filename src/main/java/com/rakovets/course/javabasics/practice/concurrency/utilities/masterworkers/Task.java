package com.rakovets.course.javabasics.practice.concurrency.utilities.masterworkers;

import java.util.concurrent.Callable;

import static java.lang.Thread.sleep;

public class Task implements Callable {

    private int num;

    public Task(int num) {
        this.num = num;
    }

    @Override
    public Object call() {
        try {
            sleep(num * 1000);

        } catch (InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getName() + " slept " + num + " seconds");
        return null;
    }
}
