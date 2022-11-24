package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.concurrent.Semaphore;
import java.util.logging.Logger;

public class Consumer extends Thread {
    private final Logger logger = Logger.getLogger(Consumer.class.getName());
    private final CommonQueue commonQueue;
    private final Semaphore semaphore;
    private String fileDirname;
    public Consumer(ThreadGroup threadGroup, String name, CommonQueue commonQueue, String fileDirName, Semaphore semaphore) {
        super(threadGroup, name);
        this.commonQueue = commonQueue;
        this.fileDirname = fileDirName;
        this.semaphore = semaphore;
    }

    public Consumer(String name, CommonQueue commonQueue, Semaphore semaphore) {
        super(name);
        this.commonQueue = commonQueue;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        logger.info(Thread.currentThread().getName() + " начал свою работу");
        while (!Thread.currentThread().isInterrupted()) {
            int i = 0;
            boolean isNotEmpty = false;
            try {
                semaphore.acquire();
                if (commonQueue.getQueue().size() > 0) {
                    i = commonQueue.removeIntFromQueue();
                    isNotEmpty = true;
                }
            } catch (NullPointerException e) {
                logger.info("Очередь пуста");
            } catch(InterruptedException e) {
                logger.info(e.getMessage());
            }
            semaphore.release();
            if (isNotEmpty) {
                logger.info(Thread.currentThread().getName() + " получил из очереди цифру " + i);
                try {
                    Thread.sleep((long) (Math.abs(i)) * 1000);
                    logger.info(Thread.currentThread().getName() + " спал " + Math.abs(i) + " миллисекунд");
                } catch (InterruptedException e) {
                    logger.info("В очереди остались следующие цифры: " + commonQueue.getQueue().toString());
                    Thread.currentThread().interrupt();
                }
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileDirname + File.separator + Thread.currentThread().getName(), true))) {
                    String textToFile = new Timestamp(System.currentTimeMillis()) + " - " + Thread.currentThread().getName() + " спал " + Math.abs(i) + " секунд\n";
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
                    logger.info(e.getMessage());
                    Thread.currentThread().interrupt();
                } catch (IOException ex) {
                    logger.info(ex.getMessage());
                }
            }
        }
        logger.info(Thread.currentThread().getName() + " также закончил свою работу");
    }
}
