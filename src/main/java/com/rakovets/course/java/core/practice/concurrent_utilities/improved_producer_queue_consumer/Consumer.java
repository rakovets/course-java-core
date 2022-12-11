package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer extends Thread {
    private static final Logger logger = Logger.getLogger(Consumer.class.getName());

    private final ConcurrentLinkedQueue<Integer> number;
    private final String filePath;
    Semaphore sem;

    public Consumer(ConcurrentLinkedQueue<Integer> number, String filePath, Semaphore sem) {
        this.number = number;
        this.filePath = filePath;
        this.sem = sem;
    }

    @Override
    public synchronized void run() {
        while (true) {
            if (!number.isEmpty()) {
                try (BufferedWriter bf = new BufferedWriter(new FileWriter(filePath, true))) {
                    sem.acquire();
                    int c = number.poll();
                    Thread.sleep(c * 1000L);
                    bf.write(String.format("${%s} - ${%s} - I slept ${%s} seconds\n",
                            LocalDateTime.now(),
                            Thread.currentThread().getName(), c));
                    bf.flush();
                } catch (UserInputException e) {
                    logger.log(Level.INFO, "Error");
                } catch (InterruptedException | IOException e) {
                    e.printStackTrace();
                } catch (NullPointerException ex) {
                    logger.log(Level.WARNING, "Null");
                }
            } else {
                try (BufferedWriter bf = new BufferedWriter(new FileWriter(filePath, true))) {
                    Thread.sleep(1000L);
                    bf.write(String.format("${%s} - ${%s} - \n",
                            LocalDateTime.now(),
                            Thread.currentThread().getName()));
                    bf.flush();
                    sem.release();
                } catch (InterruptedException | IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
