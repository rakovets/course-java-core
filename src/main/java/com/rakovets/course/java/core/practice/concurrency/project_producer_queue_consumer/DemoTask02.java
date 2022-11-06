package com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Logger;

public class DemoTask02 {


    public static void main(String[] args) throws InterruptedException {
        Logger logger = Logger.getLogger(DemoTask02.class.getName());
        Queue<Integer> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        Runnable producerRun = () -> {
            logger.info("Thread Producer started\n");
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    queue.offer(scanner.nextInt());
                } else {
                    scanner.next();
                }
                logger.info("Values in queue: " + queue.toString());
            }
        };
        Thread producer = new Thread(producerRun, "Producer");
        producer.start();
    }
}
