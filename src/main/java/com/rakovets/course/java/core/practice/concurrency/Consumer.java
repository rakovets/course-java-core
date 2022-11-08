package com.rakovets.course.java.core.practice.concurrency;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Queue;

public class Consumer extends Thread {
    private final Queue<Integer> numbers;
    private final int oneSecInMillisec = 1000;

    public Consumer(Container numbers) {
        this.numbers = numbers.getNumbers();
    }

    @Override
    public void run() {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("/Users/nikita/IdeaProjects/course-java-core/src/main/java/com" +
                    "/rakovets/course/java/core/practice/concurrency/ProdConThreads.txt", true);
            while (Thread.currentThread().isAlive()) {
                if (!numbers.isEmpty()) {
                    long sec = numbers.poll();
                    Thread.sleep(sec * oneSecInMillisec);
                    fileWriter.write(LocalDateTime.now() + " - " + Thread.currentThread().getName() + " - " + "I slept " + sec + "sec.\n");
                    fileWriter.flush();
                } else {
                    fileWriter.write(LocalDateTime.now() + " - " + Thread.currentThread().getName() + " - " + "...\n");
                    fileWriter.flush();
                    Thread.sleep(oneSecInMillisec);
                }
            }
        } catch (IOException | InterruptedException | NullPointerException e) {
            e.getStackTrace();
        }
    }
}
