package com.rakovets.course.java.core.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

public class Consumer implements Runnable {
    private final LinkedList<Integer> queue;
    private final ReentrantLock lock;

    public Consumer(LinkedList<Integer> queue, ReentrantLock lock) {
        this.queue = queue;
        this.lock = lock;
    }

    Path filePath = Paths.get("src", "main", "resources", "practice", "MasterWorker.txt");

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(filePath)))) {
            while (true) {
                try {
                    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                    lock.lock();
                    int delay = 1;
                    if (queue.peekFirst() != null) {
                        if (queue.peekFirst() == -1) {
                            lock.unlock();
                            break;
                        }
                        delay = queue.removeFirst();
                        lock.unlock();
                        writer.write(timestamp + " " + Thread.currentThread().getName() + " - I slept " + delay
                                + " seconds");
                    } else {
                        lock.unlock();
                        writer.write(timestamp + " " + Thread.currentThread().getName());
                    }
                    Thread.sleep(delay * 1000L);
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
