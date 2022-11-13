package com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer extends Thread {
    private final Logger logger = Logger.getLogger(Consumer.class.getName());
    private final int MILLS = 1000;
    private final Queue<Integer> numbers;
    private final String filePath;

    public Consumer(Container queue, String filePath) {
        this.numbers = queue.getQueue();
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            while (!Thread.currentThread().isInterrupted()) {
                if (!numbers.isEmpty()) {
                    long seconds = numbers.poll();
                    Thread.sleep(seconds * MILLS);
                    writer.write(LocalDateTime.now() + "-" + Thread.currentThread().getName() + "- I slept " +
                            seconds + " seconds.\n");
                    writer.flush();
                } else {
                    writer.write(LocalDateTime.now() + "-" + Thread.currentThread().getName() + "- ...\n");
                    writer.flush();
                    Thread.sleep(MILLS);
                    break;
                }
            }
        } catch (IOException | InterruptedException e) {
            logger.log(Level.WARNING, "StackTrace " + Arrays.toString(e.getStackTrace()));
        }
    }
}
