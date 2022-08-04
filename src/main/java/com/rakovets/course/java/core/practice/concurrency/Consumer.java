package com.rakovets.course.java.core.practice.concurrency;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class Consumer extends Thread {
    private final Queue<Integer> queue;
    private static final BufferedWriter WRITER;

    static {
        try {
            WRITER = new BufferedWriter(new FileWriter("ConsumerThread"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Consumer(String name, Queue<Integer> queue) throws IOException {
        super(name);
        this.queue = queue;
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
            try {
                if (!queue.isEmpty()) {
                    int sec = queue.poll();
                    TimeUnit.SECONDS.sleep(sec);
                    WRITER.write(LocalDateTime.now() + " - " + Thread.currentThread().getName() +
                            " - I slept " + sec + " seconds\n");
                    WRITER.flush();
                } else {
                    WRITER.write(LocalDateTime.now() + " -  " + Thread.currentThread().getName() + "\n");
                    WRITER.flush();
                    TimeUnit.SECONDS.sleep(1);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
