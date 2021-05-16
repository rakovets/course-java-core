package com.rakovets.course.java.core.practice.concurrency;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

import java.sql.Timestamp;
import java.util.Queue;

public class Consumer implements Runnable {
    private QueueDelay queue;

    public Consumer(QueueDelay queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter
                (String.valueOf(Paths.get("src", "main", "resources", "practice", "MasterWorker.txt"))));) {
            while (true) {
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                if (queue.queue.size() != 0) {
                    int delay = (int) queue.queue.poll();
                    Thread.sleep(delay * 1000);
                    writer.write(timestamp + " " + Thread.currentThread().getName() + " - I slept " + delay + " seconds");
                } else {
                    writer.write(timestamp + " " + Thread.currentThread().getName() + " - I slept 1  seconds");
                    Thread.sleep(1000);
                }
                writer.newLine();
                writer.flush();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}


