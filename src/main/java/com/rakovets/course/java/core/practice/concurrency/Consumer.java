package com.rakovets.course.java.core.practice.concurrency;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.sql.Timestamp;
import java.util.NoSuchElementException;

public class Consumer implements Runnable {
    private QueueDelay queueDelay;

    public Consumer(QueueDelay queue) {
        this.queueDelay = queue;
    }

    Path filePath = Paths.get("src", "main", "resources", "practice", "MasterWorker.txt");

    @Override
    public void run() {
        while (true) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(filePath), true));
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                if (queueDelay.queue.size() != 0) {
                    int delay = queueDelay.queue.poll();
                    Thread.sleep(delay * 1000);
                    writer.write(timestamp + " " + Thread.currentThread().getName() + " - I slept " + delay + " seconds");
                } else {
                    writer.write(timestamp + " " + Thread.currentThread().getName() + " - I slept 1  seconds");
                    Thread.sleep(1000);
                }
                writer.newLine();
                writer.flush();
            } catch (IOException | InterruptedException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }
}
