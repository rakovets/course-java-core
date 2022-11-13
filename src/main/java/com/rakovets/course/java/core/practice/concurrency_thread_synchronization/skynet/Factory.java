package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.logging.Logger;

public class Factory {
    private final Logger logger = Logger.getLogger(Factory.class.getName());
    private boolean dayTime;
    private int daysTerm;
    private final Queue<String> repository = new LinkedList<>();
    private final Random random = new Random();

    public Factory(int daysTerm) {
        this.daysTerm = daysTerm;
        dayTime = true;
    }

    public synchronized void create() {
        while (!dayTime) {
            try {
                wait();
            } catch (InterruptedException e) {
                logger.severe(e.getMessage());
            }
        }
        for (int i = 1; i <= 10; i++) {
            int detailNumber = random.nextInt(4);
            String getDetail = "";
            switch (detailNumber) {
                case 0:
                    getDetail = "head";
                    break;
                case 1:
                    getDetail = "torso";
                    break;
                case 2:
                    getDetail = "hand";
                    break;
                case 3:
                    getDetail = "feet";
                    break;
            }
            repository.add(getDetail);
            logger.info(Thread.currentThread().getName() + " " + getDetail + " was created");
        }
        if (repository.size() == 10) {
            dayTime = false;
            logger.info("The night has begun");
            daysTerm--;
            notifyAll();
        }
    }

    public synchronized String getDetails() {
        while (dayTime) {
            try {
                wait();
            } catch (InterruptedException e) {
                logger.severe(e.getMessage());
            }
        }
        String detail = "garbage";
        if (repository.isEmpty()) {
            dayTime = true;
            logger.info("The day has begun");
            notifyAll();
        } else {
            detail = repository.poll();
        }
        return detail;
    }

    public int getDaysTerm() {
        return daysTerm;
    }
}
