package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.List;
import java.util.logging.Logger;

public class Factory {
    private static final Logger logger = Logger.getLogger(Factory.class.getName());
    private List<String> details;
    private final int DETAILS_CAPACITY = 10;
    private final int MIN_DETAILS_AMOUNT = 1;

    public synchronized void produce(String detail) {
        while (details.size() >= DETAILS_CAPACITY) {
            try {
                wait();
            } catch (InterruptedException e) {
                logger.info(e.getMessage());
            }
        }

        details.add(detail);
        logger.info(String.format("%s thread added detail %s\n", Thread.currentThread().getName(), details));
        logger.info(String.format("Current amount of details in Factory: %s\n ", details.size()));
        notify();
    }

    public synchronized String consume() {
        while (details.size() < MIN_DETAILS_AMOUNT) {
            try {
                wait();
            } catch (InterruptedException e) {
                logger.info(e.getMessage());
            }
        }

        String detail = details.remove(0);
        logger.info(String.format("%s thread took detail %s\n", Thread.currentThread().getName(), detail));
        logger.info(String.format("Current amount of details in Factory: %s\n ", details.size()));
        notify();
        return detail;
    }

    public Factory(List<String> details) {
        this.details = details;
    }
}
