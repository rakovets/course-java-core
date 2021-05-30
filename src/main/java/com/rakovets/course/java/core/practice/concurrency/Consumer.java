package com.rakovets.course.java.core.practice.concurrency;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.sql.Timestamp;
import java.util.LinkedList;

public class Consumer implements Runnable {
    private final LinkedList<Integer> queue;

    public Consumer(LinkedList<Integer> queue) {
        this.queue = queue;
    }

    Path filePath = Paths.get("src", "main", "resources", "practice", "MasterWorker.txt");

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(filePath)))) {
            while (true) {
                try {
                    int delay = 1;
                    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                    if (queue.peek() != null) {
                        if (queue.peek() == -1) {
                            break;
                        }
                        delay = queue.poll();
                        Thread.sleep(delay * 1000L);
                        writer.write(timestamp + " " + Thread.currentThread().getName() + " - I slept " + delay
                                + " seconds");
                    } else {
                        writer.write(timestamp + " " + Thread.currentThread().getName());
                        Thread.sleep(1000);
                    }
                    writer.newLine();
                    writer.flush();
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
