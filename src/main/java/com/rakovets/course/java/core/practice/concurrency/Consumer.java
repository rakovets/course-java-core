package com.rakovets.course.java.core.practice.concurrency;

import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class Consumer extends Thread {
    private final Queue<Integer> queue;
    private final BufferedWriter writer;

    public Consumer(String name, Queue<Integer> queue, BufferedWriter writer) {
        super(name);
        this.queue = queue;
        this.writer = writer;
    }

    @Override
    public void run() {
        try {
            getNumbersFromProducerThread();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void getNumbersFromProducerThread() throws IOException {
        while (!Thread.currentThread().isInterrupted()) {
            if (!queue.isEmpty()) {
                int sec = queue.poll();
                try {
                    Thread.sleep(TimeUnit.SECONDS.toMillis(sec));
                    writer.write(LocalDateTime.now() + " " + Thread.currentThread().getName() +
                            " I slept " + sec + " seconds\n");
                    writer.flush();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                writer.write(LocalDateTime.now() + " " + Thread.currentThread().getName() + "\n");
                writer.flush();
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
