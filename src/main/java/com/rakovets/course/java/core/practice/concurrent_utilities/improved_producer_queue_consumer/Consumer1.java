package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.time.LocalDateTime;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer1 extends Thread {
    private static final Logger logger = Logger.getLogger(Consumer.class.getName());
    private boolean isActive;
    private final ConcurrentLinkedQueue<Integer> integers;
    Semaphore sem;

    public Consumer1(ConcurrentLinkedQueue<Integer> integers, Semaphore sem) {
        this.integers = integers;
        this.sem = sem;
    }

    void disable() {
        isActive = false;
    }

    @Override
    public synchronized void run() {
        isActive = true;
        boolean flag;
        Integer c = 0;
        while (true) {
            try {
                sem.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = false;
            if (!integers.isEmpty()) {
                try {
                    c = integers.poll();
                    flag = true;
                } catch (UserInputException e) {
                    logger.log(Level.WARNING, "UserInputException ERROR");
                }
            }
            sem.release();
            if (!isActive && !flag) {
                logger.log(Level.INFO, (String.format("${%s} - Thread is here\n",
                        Thread.currentThread().getName())));
                break;
            }
            if (flag) {
                try {
                    Thread.sleep(c * 1000L);
                } catch (InterruptedException e) {
                    logger.log(Level.WARNING, "InterruptedException ERROR");
                }
                logger.log(Level.INFO, (String.format("${%s} - ${%s} - I slept ${%s} seconds\n",
                        LocalDateTime.now(),
                        Thread.currentThread().getName(), c)));
            } else {
                try {
                    Thread.sleep(1000l);
                } catch (InterruptedException e) {
                    logger.log(Level.WARNING, "InterruptedException ERROR Doing nothing");
                }
            }
        }
    }
}
