package com.rakovets.course.java.core.practice.concurrency;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Queue;

public class Consumer implements Runnable {
    private final int MILLIS = 1000;
    private Queue<Integer> integerNumbersQueue;

    public Consumer(QueueOfIntegerNumbers queueOfIntegerNumbers) {
        integerNumbersQueue = queueOfIntegerNumbers.getQueue();
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("consumerLog.txt", true))) {
            while (true) {
                Integer seconds = integerNumbersQueue.poll();
                if (seconds != null) {
                    Thread.sleep(seconds * MILLIS);
                    writer.write(LocalDateTime.now() + " - " + Thread.currentThread().getName()
                            + " - I slept " + seconds + " seconds\n");
                } else {
                    writer.write(LocalDateTime.now() + " - " + Thread.currentThread().getName() + " - ...\n");
                    Thread.sleep(1000);
                }
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
