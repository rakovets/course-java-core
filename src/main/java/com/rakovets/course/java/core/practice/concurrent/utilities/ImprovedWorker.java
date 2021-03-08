package com.rakovets.course.java.core.practice.concurrent.utilities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class ImprovedWorker implements Runnable {
    private CopyOnWriteArrayList<Integer> list1;
    private String destinationPath;
    private final String name;
    private ReentrantLock locker;

    public ImprovedWorker(CopyOnWriteArrayList<Integer> list2, String destinationPath, String name, ReentrantLock locker) {
        this.list1 = list2;
        this.destinationPath = destinationPath;
        this.name = name;
        this.locker = locker;
    }

    @Override
    public void run() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(destinationPath, true))) {
            boolean stop = true;
            try {
                do {
                    locker.lock();
                    if (list1.isEmpty()) {
                        bw.write(String.format("%s - %s - ...\n", new Timestamp(System.currentTimeMillis()).toString(), this.name));
                        bw.flush();
                        locker.unlock();
                        Thread.sleep(1000L);
                    } else {
                        int seconds = list1.remove(0);
                        if (seconds == -1) {
                            stop = false;
                            list1.add(-1);
                            locker.unlock();
                        } else {
                            bw.write(String.format("%s - %s - I slept %d seconds\n",
                                    new Timestamp(System.currentTimeMillis()).toString(), this.name, seconds));
                            bw.flush();
                            locker.unlock();
                            Thread.sleep(seconds * 1000L);
                        }
                    }
                } while (stop);
            } catch (InterruptedException e) {
                e.printStackTrace();
                locker.unlock();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
