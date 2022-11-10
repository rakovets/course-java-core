package com.rakovets.course.java.core.practice.concurrency;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Logger;

public class Consumer implements Runnable {
    public static final Logger LOGGER = Logger.getLogger(Consumer.class.getName());
    private static Queue<Integer> queue = new LinkedList<>();
    private final Path path;

    public Consumer(Queue<Integer> queue, Path path) {
        this.queue = queue;
        this.path = path;
    }

    public synchronized Integer getItem() {
        return queue.poll();
    }
    @Override
    public void run() {
        try (OutputStreamWriter output = new OutputStreamWriter(
                new FileOutputStream(path.toFile()))) {
            while (true) {
                if (!(queue.isEmpty())) {
                    Integer value;
                    if (queue.peek() == -1) {
                        break;
                    }
                    value = queue.poll();
                    Thread.sleep(value * 1000L);
                    output.write(String.format("${%s} - ${%s} - I slept ${%d} seconds \n", LocalDateTime.now(), Thread.currentThread().getName(), value));
                } else {
                    output.write(String.format("${%s} - ${%s} - ...\n", LocalDateTime.now(), Thread.currentThread().getName()));
                    Thread.sleep(1000L);
                }
                output.flush();
            }
        } catch (IOException e) {
            LOGGER.info(e.getMessage());
        } catch (InterruptedException e) {
            LOGGER.info(e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}
