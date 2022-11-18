package com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer extends Thread {
    public static final Logger logger = Logger.getLogger(Consumer.class.getName());
    private final int MILLS_IN_SECOND = 1000;
    private final ConcurrentLinkedQueue<Integer> container;
    private final ReentrantLock locker;
    private final Path filePath = Paths.get("src", "test", "resources", "practice.concurrent_utilities", "Producer-Consumer.txt");

    public Consumer(ConcurrentLinkedQueue<Integer> container, ReentrantLock locker) {
        this.container = container;
        this.locker = locker;
    }

    public void run() {
        try {
            FileWriter writer = new FileWriter(filePath.toString(), true);
            while (!Thread.currentThread().isInterrupted()) {

                if (!container.isEmpty()) {
                    locker.lock();
                    long seconds = container.poll();
                    Thread.sleep(seconds * MILLS_IN_SECOND);
                    writer.write(LocalDateTime.now() + "-" + Thread.currentThread().getName() + "- I slept "
                            + seconds + " seconds.\n");
                    writer.flush();
                    locker.unlock();
                } else {
                    locker.unlock();
                    writer.write(LocalDateTime.now() + "-" + Thread.currentThread().getName() + "- I...\n");
                    writer.flush();
                    Thread.sleep(MILLS_IN_SECOND);
                }
            }
        } catch (IOException | InterruptedException e) {
            locker.unlock();
            logger.log(Level.SEVERE, "StackTrace " + Arrays.toString(e.getStackTrace()));
        }
    }
}
