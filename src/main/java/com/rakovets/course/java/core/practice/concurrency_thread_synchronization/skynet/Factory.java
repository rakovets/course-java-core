package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.logging.Logger;

public class Factory {
    private final Logger logger = Logger.getLogger(Factory.class.getName());
    private final DeadlineTimer timer;
    private final Queue<String> repository;
    private final Random random;
    private final int factoryCapacityPerDay;

    public Factory(DeadlineTimer timer, int factoryCapacityPerDay, Queue<String> repository, Random random) {
        this.timer = timer;
        this.factoryCapacityPerDay = factoryCapacityPerDay;
        this.repository = repository;
        this.random = random;
    }

    public Factory(DeadlineTimer timer, int factoryCapacityPerDay) {
        this.timer = timer;
        this.factoryCapacityPerDay = factoryCapacityPerDay;
        repository = new LinkedList<>();
        random = new Random();
    }

    public synchronized void create() {
        while (timer.getTimeOfDay().equals("day")) {
            try {
                wait();
            } catch (InterruptedException e) {
                logger.severe(e.getMessage());
            }
        }
        for (int i = 1; i <= factoryCapacityPerDay; i++) {
            int detailNumber = random.nextInt(4);
            String detail = "";
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
            repository.add(detail);
            logger.info(Thread.currentThread().getName() + " " + detail + " was created");
        }
        notifyAll();
    }

    public synchronized String getDetails() {
        return repository.poll();
    }

    public Queue<String> getRepository() {
        return repository;
    }
}
