package com.rakovets.course.java.core.practice.concurrency;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

import java.sql.Timestamp;
import java.util.Queue;

public class Consumer implements Runnable {
    private Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(
                    String.valueOf(Paths.get("src", "main", "resources", "practice", "MasterWorker.txt"))));
            if (queue.size() != 0) {
                int delay = (int) queue.poll();
                Thread.sleep(delay * 1000);
                writer.write(timestamp + Thread.currentThread().getName() + " - I slept " + delay + " seconds");
            } else {
                writer.write(timestamp + Thread.currentThread().getName() + " - I slept " + 1000 + " seconds");
                Thread.sleep(1000);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

