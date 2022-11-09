package com.rakovets.course.java.core.practice.concurrency.producer_queue_consumer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDateTime;
import java.util.Queue;
import java.util.logging.Logger;

public class Consumer extends Thread {
    public static final Logger logger = Logger.getLogger(Consumer.class.getName());

    private final Queue<Integer> integerQueue;

    public Consumer(Container queue1) {
        this.integerQueue = queue1.getQueue();
    }

    @Override
    public void run() {
        try (Writer fw = new FileWriter(MyFile.OUTPUT_FILE, true)) {
            for (int digitFromProducer : integerQueue) {
                try {
                    Thread.sleep(digitFromProducer * 1000L);
                    fw.write(String.format("%s - %s - I slept %d seconds\n"
                            , LocalDateTime.now()
                            , Thread.currentThread().getName()
                            , digitFromProducer));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fw.write(String.format("%s - %s", LocalDateTime.now(), Thread.currentThread().getName()));
            }
        } catch (IOException e) {
            logger.info(e.getMessage());
        }
    }
}
