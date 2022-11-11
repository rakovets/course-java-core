package com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer.task_06;

import com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer.task_05.CommonQueue;

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
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileDirname + File.separator +Thread.currentThread().getName(), true))) {
                        String textToFile = new Timestamp(System.currentTimeMillis()).toString() + " - " + Thread.currentThread().getName() + " - " + "I slept " + Math.abs(i) + " seconds\n";
                        logger.info(textToFile);
                        bw.write(textToFile);
                    } catch (IOException ex) {
                        logger.info(ex.getMessage());
                    }
                }
            }
        }
        logger.info("Thread Consumer also finished");
    }
}
