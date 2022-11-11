package com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer.task_02;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Logger;

public class Producer extends Thread {
    public Producer(String name) {
        super(name);
    }

    @Override
    public void run() {
        Logger logger = Logger.getLogger(Producer.class.getName());
        Queue<Integer> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        logger.info("Thread Producer started");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                queue.offer(scanner.nextInt());
            } else {
                logger.info("You must enter only int value");
                scanner.next();
            }
            logger.info("Values in queue: " + queue.toString());
        }
    }
}
