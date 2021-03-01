package com.rakovets.course.java.core.practice.concurrency.common.MasterWorker;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;

public class ThreadWorker implements Runnable {
    private final CommonResource commonResource;
    boolean isRun = true;

    public ThreadWorker(CommonResource commonResource) {
        this.commonResource = commonResource;
    }

    Path filePath = Paths.get("src", "main", "resources", "MasterWorker.txt");

    Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(filePath)))) {
            while (isRun) {
                if (commonResource.list.peek() != null) {
                    long numberOfSeconds = commonResource.list.pollFirst();
                    sleep(numberOfSeconds * 1000);
                    writer.write(timestamp + " - I slept " + numberOfSeconds + " seconds");
                } else {
                    writer.write(timestamp + " - ...");
                    sleep(1000);
                }
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
