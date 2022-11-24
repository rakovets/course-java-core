package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.logging.Logger;

public class Consumer extends Thread {


    private final CommonQueue commonQueue;
    private String fileDirname;
    public Consumer(ThreadGroup threadGroup, String name, CommonQueue commonQueue, String fileDirName) {
        super(threadGroup, name);
        this.commonQueue = commonQueue;
        this.fileDirname = fileDirName;
    }

    public Consumer(String name, CommonQueue commonQueue) {
        super(name);
        this.commonQueue = commonQueue;
    }

    @Override
    public void run() {
        final Logger logger = Logger.getLogger(Consumer.class.getName());
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
                        Thread.sleep((long) (Math.abs(i)) * 1000);
                        logger.info("Consumer slept: " + Math.abs(i) + " millis");
                    } catch (InterruptedException e) {
                        logger.info("В очереди остались следующие цифры: " + commonQueue.getQueue().toString());
                        Thread.currentThread().interrupt();
                    }
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileDirname + File.separator + Thread.currentThread().getName(), true))) {
                        String textToFile = new Timestamp(System.currentTimeMillis()) + " - " + Thread.currentThread().getName() + " - " + "I slept " + Math.abs(i) + " seconds\n";
                        logger.info(textToFile);
                        bw.write(textToFile);
                    } catch (IOException ex) {
                        logger.info(ex.getMessage());
                    }
                } else {
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileDirname + File.separator + Thread.currentThread().getName(), true))) {
                        Thread.sleep(5000);
                        String textToFile = new Timestamp(System.currentTimeMillis()) + " - " + Thread.currentThread().getName() + " - " + "...\n";
                        logger.info(textToFile);
                        bw.write(textToFile);
                    } catch (InterruptedException e) {
                        logger.info("В очереди остались следующие цифры: " + commonQueue.getQueue().toString());
                        Thread.currentThread().interrupt();
                    } catch (IOException ex) {
                        logger.info(ex.getMessage());
                    }
                }
            }
        }
        logger.info("Thread Consumer also finished");
    }
}
