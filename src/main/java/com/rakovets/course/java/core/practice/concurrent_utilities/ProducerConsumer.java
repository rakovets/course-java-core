package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Logger;

public class ProducerConsumer {
    private static final BufferedWriter WRITER;
    private static final  String SLEEP_PATTERN = "%s - %s -  slept [%s] seconds\n";
    private static final String LOG_PATTERN = "%s - %s\n";
    private static BlockingQueue<Integer> blockingQueue;
    private final Logger logger = Logger.getLogger(ProducerConsumer.class.getName());

    static {
        try {
            WRITER = new BufferedWriter(new FileWriter("ConsumerThread"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ProducerConsumer(int capacityQueue) {
        blockingQueue = new LinkedBlockingQueue(capacityQueue);
    }

    public void produce() {
        String inputString;
        try (BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.print("Enter Integer Number: ");
                inputString = bufferRead.readLine();
                if (!inputString.matches("-?[\\d]+")) {
                    logger.severe("Only Integer Number!");
                    continue;
                }
                if (Objects.equals(inputString, "-1")) {
                    return;
                }
                blockingQueue.put(Integer.valueOf(inputString));
                System.out.println(blockingQueue);
            }
        } catch (IOException | InterruptedException e) {
            logger.severe(e.getMessage());
        }
    }

    public void consume() {
        while (true) {
            int sec;
            try {
                if (!blockingQueue.isEmpty()) {
                    sec = blockingQueue.take();
                    System.out.println(sec);
                    Thread.sleep(sec * 1000);
                    WRITER.write(String.format(SLEEP_PATTERN, LocalDateTime.now(), Thread.currentThread().getName(), sec));
                    WRITER.flush();
                } else {
                    WRITER.write(String.format(LOG_PATTERN, LocalDateTime.now(), Thread.currentThread().getName()));
                    WRITER.flush();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException | IOException e) {
                logger.severe(e.getMessage());
            }
        }
    }
}
