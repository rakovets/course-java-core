package com.rakovets.course.java.core.practice.concurrent.utilities.master_workers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class Worker implements Runnable {
    private final CopyOnWriteArrayList<Integer> request;
    private final String resultDestination;
    private final String name;
    private final ReentrantLock locker;

    public Worker(CopyOnWriteArrayList<Integer> request, String resultDestination, String name, ReentrantLock locker) {
        this.request = request;
        this.resultDestination = resultDestination;
        this.name = name;
        this.locker = locker;
    }

    @Override
    public void run() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.resultDestination, true))) {
            boolean runner = true;
            do {
                try {
                    locker.lock();
                    if (request.isEmpty()) {
                        bw.write(String.format("%s - %s - ...\n", new Timestamp(System.currentTimeMillis()).toString(), this.name));
                        bw.flush();
                        locker.unlock();
                        Thread.sleep(1000L);
                    } else {
                        int seconds = request.remove(0);
                        if (seconds == -1) {
                            runner = false;
                            request.add(-1);
                            locker.unlock();
                        } else {
                            bw.write(String.format("%s - %s - I slept %d seconds\n",
                                    new Timestamp(System.currentTimeMillis()).toString(), this.name, seconds));
                            bw.flush();
                            locker.unlock();
                            Thread.sleep(seconds * 1000L);
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    locker.unlock();
                }
            } while (runner);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
