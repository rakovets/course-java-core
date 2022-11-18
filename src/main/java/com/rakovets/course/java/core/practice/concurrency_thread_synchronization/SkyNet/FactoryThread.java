package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.SkyNet;

public class FactoryThread extends Thread {
    Timer timer;
    private final Factory factory;

    public FactoryThread(Factory factory, Timer timer) {
        this.factory = factory;
        this.timer = timer;
    }

    public void run() {
        while (timer.isActive()) {
            if (timer.getTimeOfDay().equals("day")) {
                factory.produce();
                timer.changeTime();
            } else if (factory.getDetailsKit().isEmpty()) {
                timer.changeTime();
            }
        }
    }
}
