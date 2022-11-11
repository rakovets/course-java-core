package com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer.task_05;

import java.util.logging.Logger;

public class Consumer extends Thread {
    private final CommonQueue commonQueue;
    public Consumer(ThreadGroup threadGroup, String name, CommonQueue commonQueue) {
        super(threadGroup, name);
        this.commonQueue = commonQueue;
    }

    public Consumer(String name, CommonQueue commonQueue) {
        super(name);
        this.commonQueue = commonQueue;
    }

    @Override
    public void run() {
        Logger logger = Logger.getLogger(Consumer.class.getName());
        logger.info("Thread Consumer started");
        while (!Thread.currentThread().isInterrupted()) {
            int i = 0;
            boolean isNotEmpty = false;
            synchronized (commonQueue) {
                if (commonQueue.checkIntInQueue() != -1) {
                    i = commonQueue.removeIntFromQueue();
                    isNotEmpty = true;
            }
                if (isNotEmpty) {
                    logger.info(Thread.currentThread().getName() + " получил из очереди цифру " + i);
                    try {
                        Thread.sleep(Math.abs(i) * 1000);
                        logger.info("Consumer slept: " + Math.abs(i) + " millis");
                    } catch (InterruptedException e) {
                        logger.info("В очереди остались следующие цифры: " + commonQueue.getQueue().toString());
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        logger.info("Thread Consumer also finished");
    }
}
