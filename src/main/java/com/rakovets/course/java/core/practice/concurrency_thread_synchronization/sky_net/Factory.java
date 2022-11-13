package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.List;
import java.util.logging.Logger;

public class Factory {
    private static final Logger logger = Logger.getLogger(Factory.class.getName());
    private List<String> details;

    public Factory(List<String> details) {
        this.details = details;
    }

    public synchronized void produce(String detail) {
        while (details.size() >= 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                logger.info(e.getMessage());
            }
        }
        details.add(detail);
        System.out.printf("%s add detail %s\n", Thread.currentThread().getName(), details);
        System.out.printf("Details in Factory: %s\n ", details.size());
        notify();
    }

    public synchronized String consume() {
        while (details.size() < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                logger.info(e.getMessage());
            }
        }
        String detail = details.remove(0);
        System.out.printf("%s take detail %s\n", Thread.currentThread().getName(), detail);
        System.out.printf("Details in Factory: %s\n ", details.size());
        notify();
        return detail;
    }
}
