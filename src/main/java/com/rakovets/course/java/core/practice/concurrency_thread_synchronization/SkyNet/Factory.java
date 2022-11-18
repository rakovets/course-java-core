package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.SkyNet;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.logging.Logger;

public class Factory {
    private final Logger logger = Logger.getLogger(Factory.class.getName());
    private final Queue<String> detailsKit;
    private final Timer timer;
    private final Random random;
    private final int factoryCapacity;

    public Factory(Queue<String> detailsKit, Timer timer, int factoryCapacity, Random random) {
        this.detailsKit = detailsKit;
        this.timer = timer;
        this.factoryCapacity = factoryCapacity;
        this.random = random;
    }

    public Factory(Timer timer, int factoryCapacity) {
        this.timer = timer;
        this.factoryCapacity = factoryCapacity;
        detailsKit = new LinkedList<>();
        random = new Random();
    }

    public String getRandomDetail() {
        String detail = "";
        for (int i = 1; i <= factoryCapacity; i++) {
            int detailNumber = random.nextInt(4);
            switch (detailNumber) {
                case 0:
                    detail = "head";
                    break;
                case 1:
                    detail = "torso";
                    break;
                case 2:
                    detail = "hand";
                    break;
                case 3:
                    detail = "feet";
                    break;
            }
        }
        return detail;
    }

    public synchronized void produce() {
        while (timer.getTimeOfDay().equals("day")) {
            try {
                wait();
            } catch (InterruptedException e) {
                logger.severe(e.getMessage());
            }
        }
        detailsKit.add(getRandomDetail());
        logger.info(Thread.currentThread().getName() + " " + getRandomDetail() + " has been added");
        logger.info("Amount of details: " + detailsKit.size());
        notifyAll();
    }

    public synchronized String getDetails() {
        return detailsKit.poll();
    }

    public Queue<String> getDetailsKit() {
        return detailsKit;
    }
}
