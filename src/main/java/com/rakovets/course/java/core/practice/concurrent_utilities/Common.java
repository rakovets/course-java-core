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
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Common {
    private static final BufferedWriter WRITER;
    private final static String SLEEP_PATTERN = "%s - %s -  slept [%s] seconds\n";
    private final static String LOG_PATTERN = "%s - %s\n";
    static BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue(5);

    static {
        try {
            WRITER = new BufferedWriter(new FileWriter("ConsumerThread"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    Logger logger = Logger.getLogger(Producer.class.getName());

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
            throw new RuntimeException(e);
        }
    }

    public void consume() throws IOException {
        while (true) {
            int sec;
            try {
                if (!blockingQueue.isEmpty()) {
                    sec = blockingQueue.take();
                    System.out.println(sec);
                    Thread.sleep(sec);
                    WRITER.write(String.format(SLEEP_PATTERN, LocalDateTime.now(), Thread.currentThread().getName(), sec));
                    WRITER.flush();
                } else {
                    WRITER.write(String.format(LOG_PATTERN, LocalDateTime.now(), Thread.currentThread().getName()));
                    WRITER.flush();
                    Thread.sleep(1);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
