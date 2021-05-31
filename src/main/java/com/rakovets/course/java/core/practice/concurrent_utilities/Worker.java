package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class Worker implements Runnable {
    private final CopyOnWriteArrayList<Integer> arrayList;
    private final String filePath;
    private final String name;
    private final ReentrantLock lock;

    public Worker(CopyOnWriteArrayList<Integer> arrayList, String filePath, String name, ReentrantLock lock) {
        this.arrayList = arrayList;
        this.filePath = filePath;
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.filePath, true))) {
            boolean runner = true;
            try {
                do {
                    lock.lock();
                    if (arrayList.isEmpty()) {
                        bufferedWriter.write(String.format("%s - %s - ...\n", new Timestamp(System.currentTimeMillis()).toString(), this.name));
                        bufferedWriter.flush();
                        Thread.sleep(1000L);
                    } else {
                        long seconds = arrayList.remove(0);
                        if (seconds == -1) {
                            runner = false;
                            arrayList.add(-1);
                            lock.unlock();
                        } else {
                            bufferedWriter.write(String.format("%s - %s - I slept %d seconds\n",
                                    new Timestamp(System.currentTimeMillis()).toString(), this.name, seconds));
                            bufferedWriter.flush();
                            lock.unlock();
                            Thread.sleep(seconds * 1000);
                        }
                    }
                } while (runner);
            } catch (InterruptedException e) {
                e.printStackTrace();
                lock.unlock();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public CopyOnWriteArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getName() {
        return name;
    }

    public ReentrantLock getLock() {
        return lock;
    }
}
