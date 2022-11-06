package com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer;

import java.util.Scanner;
import java.util.logging.Logger;

public class DemoTask01 {
    public static void main(String[] args) throws InterruptedException {
        Logger logger = Logger.getLogger(DemoTask01.class.getName());
        Scanner scanner = new Scanner(System.in);
        Runnable producerRun = () -> {
            logger.warning("Thread Producer started\n");
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    logger.info("User entered value: " + scanner.next());
                } else {
                    scanner.next();
                }
            }
        };
        Thread producer = new Thread(producerRun, "Producer");
        producer.start();
    }
}
