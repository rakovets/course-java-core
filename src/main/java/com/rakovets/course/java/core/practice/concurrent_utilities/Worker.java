package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Worker extends Thread {
    private volatile List<Integer> listOfNumbers;
    private boolean isActive;
    private ReentrantLock locker;

    public Worker(List<Integer> listOfNumbers, ReentrantLock locker) {
        this.listOfNumbers = listOfNumbers;
        this.isActive = true;
        this.locker = locker;
    }
    Path filePath = Paths.get("src", "main", "resources", "practice", "MasterWorker.txt");

    @Override
    public void run() {
        int timeSleep = 0;
        while (isActive) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(filePath)))) {
                if (listOfNumbers.size() == 0) {
                    Thread.sleep(1000);
                    locker.lock();
                    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                    writer.write(timestamp + Thread.currentThread().getName() + " - ...\n");
                    locker.unlock();
                } else if (listOfNumbers.size() > 0 && listOfNumbers.get(0) != -1) {
                    timeSleep = listOfNumbers.get(listOfNumbers.size() - 1);
                    listOfNumbers.remove(0);
                    Thread.sleep(timeSleep * 1000);
                    locker.lock();
                    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                    writer.write(timestamp + Thread.currentThread().getName() + " - I slept " + timeSleep + " seconds\n");
                    locker.unlock();
                } else if (listOfNumbers.get(0) == - 1) {
                    isActive = false;
                }
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}

