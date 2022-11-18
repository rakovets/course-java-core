package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.SkyNet;

public class FractionThread extends Fraction implements Runnable {
    private Timer timer;
    private final Factory factory;

    public FractionThread(String fractionName, Factory factory, Timer timer) {
        super(fractionName);
        this.factory = factory;
        this.timer = timer;
    }

    public void run() {
        while (timer.isActive()) {
            if (timer.getTimeOfDay().equals("night")) {
                receiveDetails(factory);
            }
        }
        makeRobots();
    }
}
