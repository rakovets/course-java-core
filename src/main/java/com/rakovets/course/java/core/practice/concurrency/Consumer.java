package com.rakovets.course.java.core.practice.concurrency;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Consumer extends Thread {
    private static final BufferedWriter WRITER;
    private final static String SLEEP_PATTERN = "%s - %s -  slept [%s] seconds\n";
    private final static String LOG_PATTERN = "%s - %s\n";

    static {
        try {
            WRITER = new BufferedWriter(new FileWriter("ConsumerThread"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private final Queue<Integer> queue;
    private final Logger logger = Logger.getLogger(Consumer.class.getName());

    public Consumer(String name, Queue<Integer> queue) throws IOException {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        getNumbersFromProducerThread();
    }

    public void getNumbersFromProducerThread() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                synchronized (queue) {
                    if (!queue.isEmpty()) {
                        int sec = queue.poll();
                        TimeUnit.SECONDS.sleep(sec);
                        WRITER.write(String.format(SLEEP_PATTERN, LocalDateTime.now(), Thread.currentThread().getName(), sec));
                        WRITER.flush();
                    } else {
                        WRITER.write(String.format(LOG_PATTERN, LocalDateTime.now(), Thread.currentThread().getName()));
                        WRITER.flush();
                        TimeUnit.SECONDS.sleep(1);
                    }
                }
            } catch (InterruptedException | IOException e) {
                logger.severe("Unexpected exception");
            }
        }
    }
}
