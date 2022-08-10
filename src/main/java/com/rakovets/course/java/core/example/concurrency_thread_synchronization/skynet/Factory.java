package com.rakovets.course.java.core.example.concurrency_thread_synchronization.skynet;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.logging.Logger;

public class Factory extends Thread {
    private final static Queue<Details> DETAILS = new ArrayDeque<>();
    private static final List<Details> DETAILS_LIST = List.of(Details.values());
    private final Random random = new Random();
    Logger logger = Logger.getLogger("Factory");
    private int daysLeft;
    private boolean daytime = true;


    public Factory(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public synchronized void produceDetails() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            DETAILS.add(DETAILS_LIST.get(random.nextInt(DETAILS_LIST.size())));
        }
        daysLeft--;
        daytime = false;
        notifyAll();
        while (!daytime) {
            wait();
        }
        logger.info("10 details has been created by factory");
    }

    @Override
    public void run() {
        while (daysLeft != 0) {
            try {
                produceDetails();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized List<Details> stealDetails() throws InterruptedException {
        while (daytime && daysLeft > 0) {
            wait();
        }
        List<Details> stolen = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (DETAILS.isEmpty()) {
                daytime = true;
                notifyAll();
                return stolen;
            }
            stolen.add(DETAILS.poll());
        }
        return stolen;
    }
}
