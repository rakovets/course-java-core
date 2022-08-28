package com.rakovets.course.java.core.practice.concurrency;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Queue;

public class Consumer implements Runnable {
    private Queue<Integer> integerQueue;

    public Consumer(QueueOfInteger queueOfInteger) {
        integerQueue = queueOfInteger.getQueue();
    }

    @Override
    public void run() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("consumer.txt", true))) {
            while (true) {
                Integer seconds = integerQueue.poll();
                if (seconds == null) {
                    bufferedWriter.write(LocalDate.now()
                            + " - " + Thread.currentThread().getName() + " - ...");
                    Thread.sleep(1000);
                } else {
                    Thread.sleep(seconds * 1000);
                    bufferedWriter.write(LocalDate.now()
                            + " - " + Thread.currentThread().getName()
                            + " - I slept " + seconds + " seconds");
                }
            }
        } catch (IOException | UserInputException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
