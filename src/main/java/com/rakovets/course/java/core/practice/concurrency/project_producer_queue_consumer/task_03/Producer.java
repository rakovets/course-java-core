package com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer.task_03;

import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Logger;

public class Producer extends Thread {
    private Queue<Integer> queue;
    public Producer(String name, Queue<Integer> queue) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        Logger logger = Logger.getLogger(Producer.class.getName());
        Scanner scanner = new Scanner(System.in);
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
    }
}
