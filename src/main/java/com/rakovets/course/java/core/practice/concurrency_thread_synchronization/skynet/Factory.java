package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.logging.Logger;

public class Factory extends Thread {
    public final static Logger logger = Logger.getLogger(Factory.class.getName());
    private final static Queue<SkyNet.Details> DETAILS = new ArrayDeque<>();
    private  final static List<SkyNet.Details> DETAILS_LIST = List.of(SkyNet.Details.values());
    private final Random random = new Random();

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
        logger.info("10 details were created at the factory");
    }

    @Override
    public void run() {
        while (daysLeft != 0) {
            try {
                produceDetails();
            } catch (InterruptedException e) {
                logger.warning("Exception during factory operation: " + e.getMessage());
            }
        }
    }

    public synchronized List<SkyNet.Details> stealDetails(int countSteal) throws InterruptedException {
        while (daytime && daysLeft > 0) {
            wait();
        }
        List<SkyNet.Details> stolen = new ArrayList<>();
        for (int i = 0; i < countSteal; i++) {
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
