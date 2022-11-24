package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.logging.Logger;

public class Factory extends Thread {
    private static final Logger logger = Logger.getLogger(Factory.class.getName());
    private final Queue<Details> details = new LinkedList<>();
    private int daysBeforeWar;
    private boolean isDayTime = true;
    private final int FACTORY_CAPACITY = 10;

    public Factory(int daysBeforeWar) {
        this.daysBeforeWar = daysBeforeWar;
    }

    public synchronized void produce() {
        for (int i = 0; i < FACTORY_CAPACITY; i++) {
            details.add(getRandomDetail());
        }
        daysBeforeWar--;
        isDayTime = false;
        System.out.printf("%s add detail %s\n", Thread.currentThread().getName(), details);
        System.out.printf("Details in Factory: %s\n ", details.size());
        notifyAll();
        while (!isDayTime) {
            try {
                wait();
            } catch (InterruptedException e) {
                logger.severe(e.getMessage());
            }
        }
    }

    @Override
    public void run() {
        while (daysBeforeWar != 0) {
            produce();
        }
    }

    public synchronized List<Details> consume(int countConsume) {
        while (isDayTime && daysBeforeWar > 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                logger.info(e.getMessage());
            }
        }
        List<Details> consumerDetails = new ArrayList<>();
        for (int i = 0; i < countConsume; i++) {
            if (details.isEmpty()) {
                isDayTime = true;
                notifyAll();
                return consumerDetails;
            }
            consumerDetails.add(details.poll());
            System.out.printf("%s take details \n", Thread.currentThread().getName());
            System.out.printf("Details in Factory: %s\n ", details.size());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return consumerDetails;
    }

    public Details getRandomDetail() {
        List<Details> detail = new ArrayList<>();
        detail.add(Details.FEET);
        detail.add(Details.HAND);
        detail.add(Details.HEAD);
        detail.add(Details.TORSO);
        Random random = new Random();
        int position = random.nextInt(detail.size());
        return detail.get(position);
    }
}
