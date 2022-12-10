package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.time.LocalDateTime;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer extends Thread {
    private static final Logger logger = Logger.getLogger(Consumer.class.getName());

    private final ConcurrentLinkedQueue<Integer> number;
    ReentrantLock locker = new ReentrantLock();

    public Consumer(ConcurrentLinkedQueue<Integer> number) {
        this.number = number;
    }

    @Override
    public void run() {
        while (true) {
            if (!number.isEmpty()) {
                try {
                    int c = number.poll();
                    Thread.sleep(c * 1000L);
                    logger.log(Level.INFO,
                            String.format("${%s} - ${%s} - I slept ${%s} seconds\n",
                                    LocalDateTime.now(),
                                    Thread.currentThread().getName(), c));
                } catch (UserInputException e) {
                    logger.log(Level.INFO, "Error");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (NullPointerException ex) {
                    logger.log(Level.WARNING, "Something wrong");
                }
            }
        }
    }
}
