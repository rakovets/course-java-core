package com.rakovets.course.java.core.practice.concurrency.Producer_Queue_Consumer;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Queue;

public class Consumer extends Thread {
    private final Queue<Integer> numbers;
    private final int ONE_SEC_IN_MILLISECOND = 1000;
    private final String filePath;

    public Consumer(Container numbers, String filePath) {
        this.numbers = numbers.getNumbers();
        this.filePath = filePath;
    }

    @Override
    public void run() {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(filePath, true);
            while (!Thread.currentThread().isInterrupted()) {
                if (!numbers.isEmpty()) {
                    long sec = numbers.poll();
                    Thread.sleep(sec * ONE_SEC_IN_MILLISECOND);
                    fileWriter.write(LocalDateTime.now() + " - " + Thread.currentThread().getName() + " - " + "I slept " + sec + "sec.\n");
                    fileWriter.flush();
                } else {
                    fileWriter.write(LocalDateTime.now() + " - " + Thread.currentThread().getName() + " - " + "...\n");
                    fileWriter.flush();
                    Thread.sleep(ONE_SEC_IN_MILLISECOND);
                    break;
                }
            }
        } catch (IOException | InterruptedException e) {
            e.getStackTrace();
        }
    }
}
