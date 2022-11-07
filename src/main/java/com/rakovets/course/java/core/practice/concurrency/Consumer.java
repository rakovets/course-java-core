package com.rakovets.course.java.core.practice.concurrency;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.Queue;
import java.util.logging.Logger;
import java.io.IOException;

public class Consumer extends Thread {
    private final int milliseconds = 1000;
    private final Queue<Integer> numbers;
    private String fileName;
    public static final Logger logger = Logger.getLogger(Consumer.class.getName());

    public Consumer(Container queue) {
        this.numbers = queue.getQueue();
        this.fileName = fileName;
    }

    public void run() {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            for (int number : numbers) {
                try {
                    Thread.sleep(number * milliseconds);
                    fileWriter.write(LocalDateTime.now() + "-" + Thread.currentThread().getName() + "- I slept " + milliseconds / 1000 + " seconds.\n");
                } catch (InterruptedException e) {
                    logger.info("Work interrupted");
                }
                fileWriter.write(LocalDateTime.now() + "-" + Thread.currentThread().getName() + "- ...\n");
            }
        } catch (IOException e) {
            logger.info(e.getMessage());
        }
    }
}
