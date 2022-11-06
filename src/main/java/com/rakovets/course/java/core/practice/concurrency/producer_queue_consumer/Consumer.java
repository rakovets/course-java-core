package com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Queue;

public class Consumer extends Thread {
    private final int MILLS = 1000;
    private final Queue<Integer> numbers;

    public Consumer(Container queue) {
        this.numbers = queue.getQueue();
    }

    @Override
    public void run() {
        try {
            FileWriter writer = new FileWriter("D://IT/Courses IT Academy/course-java-core/src/main/java/com/rakovets/course/java/core/practice/concurrency/ProducerConsumer.txt",
                    true);
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
        } catch (NullPointerException | IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
