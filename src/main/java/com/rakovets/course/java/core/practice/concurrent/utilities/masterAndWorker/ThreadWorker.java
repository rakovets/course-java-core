package com.rakovets.course.java.core.practice.concurrent.utilities.masterAndWorker;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWorker extends Thread {
    private volatile List<Integer> listOfNumbers;
    private boolean isActive;
    private ReentrantLock locker;

    public ThreadWorker(List<Integer> listOfNumbers, ReentrantLock locker) {
        this.listOfNumbers = listOfNumbers;
        this.isActive = true;
        this.locker = locker;
    }

    @Override
    public void run() {
        int timeSleep = 0;
        while (isActive) {
            try (FileWriter writer = new FileWriter("src/test/java/resources/practice/concurrent/utilities/masterWorker/worker.txt", true)) {
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
