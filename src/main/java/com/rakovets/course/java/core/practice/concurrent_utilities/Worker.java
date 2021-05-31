package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class Worker implements Runnable {
    private Queue<Integer> commonResource;
    Path filePath = Paths.get("src", "main", "resources", "practice", "ThreadLog.txt");
    private static boolean status = true;
    private ReentrantLock lock;

    public Worker(Queue<Integer> commonResource, ReentrantLock lock) {
        this.commonResource = commonResource;
        this.lock = lock;
    }

    public static void setStatus(boolean status) {
        Worker.status = status;
    }

    public static boolean isStatus() {
        return status;
    }

    public void run () {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.valueOf(filePath)));
            while (isStatus()) {
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                lock.lock();
                if (commonResource.peek() != null) {
                    int sleepTime = commonResource.poll();
                    Thread.sleep(sleepTime * 1000);
                    lock.unlock();
                    bufferedWriter.write(timestamp + " " + Thread.currentThread().getName() + " I slept " + sleepTime + " seconds");
                } else {
                    Thread.sleep(1000);
                    lock.unlock();
                    bufferedWriter.write(timestamp + " " + Thread.currentThread().getName());
                }
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
