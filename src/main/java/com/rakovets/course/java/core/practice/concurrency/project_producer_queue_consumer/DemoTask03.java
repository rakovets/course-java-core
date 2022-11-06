package com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Logger;

public class DemoTask03 {
    public static void main(String[] args) throws InterruptedException {
        Logger logger = Logger.getLogger(DemoTask03.class.getName());
        Queue<Integer> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        Runnable producerRun = () -> {
            logger.info("Thread Producer started\n");
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int i = scanner.nextInt();
                    if (i != -1) {
                        queue.offer(i);
                        logger.info("Last entered value to queue: " + i);
                    } else {
                        logger.info("Thread Producer is ended by entering -1.");
                        break;
                    }
                } else {
                    scanner.next();
                }
                logger.info(queue.toString());
            }
        };
        Thread producer = new Thread(producerRun, "Producer");
        producer.start();
    }
}
