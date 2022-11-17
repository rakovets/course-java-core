package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

public class FactoryThread extends Thread {
    DeadlineTimer timer;
    private final Factory factory;

    public FactoryThread(Factory factory, DeadlineTimer timer) {
        this.factory = factory;
        this.timer = timer;
    }

    public void run() {
        while (timer.isGameRunning()) {
            if (timer.getTimeOfDay().equals("day")) {
                factory.create();
                timer.switchTime();
            } else if (factory.getRepository().isEmpty()) {
                timer.switchTime();
            }
        }
    }
}
