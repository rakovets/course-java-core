package com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer.task_01;

import java.util.Scanner;
import java.util.logging.Logger;

public class Producer extends Thread {
    Producer(String name) {
        super(name);
    }
    @Override
    public void run() {
        Logger logger = Logger.getLogger(Producer.class.getName());
        Scanner scanner = new Scanner(System.in);
        logger.warning("Thread Producer started");
        try {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    logger.info("User entered value: " + scanner.next());
                } else {
                    logger.info("You must enter only int value");
                    scanner.next();
                }
            }
        } catch (IllegalStateException e) {
            logger.info("Scanner is not found");
        }
    }
}
