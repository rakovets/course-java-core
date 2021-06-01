package com.rakovets.course.java.core.practice.master_workers;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Worker extends Thread {
    private volatile List<Integer> listOfNumbers;
    private boolean isActive;
    private ReentrantLock locker;
    public long MILLISECONDS_IN_ONE_SECOND = 1000;

    public Worker(List<Integer> listOfNumbers, ReentrantLock locker) {
        this.listOfNumbers = listOfNumbers;
        this.isActive = true;
        this.locker = locker;
    }

    @Override
    public void run() {
        long timeSleep;
        while (isActive) {
            try (FileWriter writer =
                         new FileWriter("src/main/resources/worker.txt", true)) {
                if (listOfNumbers.size() == 0) {
                    Thread.sleep(MILLISECONDS_IN_ONE_SECOND);
                    locker.lock();
                    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                    writer.write(timestamp + Thread.currentThread().getName() + " - ...\n");
                    locker.unlock();
                } else if (listOfNumbers.size() > 0 && listOfNumbers.get(0) != -1) {
                    timeSleep = listOfNumbers.get(listOfNumbers.size() - 1);
                    listOfNumbers.remove(0);
                    Thread.sleep(timeSleep * MILLISECONDS_IN_ONE_SECOND);
                    locker.lock();
                    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                    writer.write(timestamp + Thread.currentThread().getName() + " - I slept "
                            + timeSleep + " seconds\n");
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
