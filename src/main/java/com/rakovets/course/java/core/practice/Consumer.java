package com.rakovets.course.java.core.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.sql.Timestamp;

public class Consumer implements Runnable {
    private static boolean status = true;
    Path filePath = Paths.get("src", "main", "resources", "practice", "MasterWorker.txt");

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(filePath)))) {
            while (isStatus()) {
                try {
                    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                    if (Producer.getQueue().size() > 0) {

                        int delay = Producer.getQueue().remove(0);
                        Thread.sleep(delay * 1000);
                        writer.write(timestamp + " " + Thread.currentThread().getName() + " - I slept " + delay
                                + " seconds");
                    } else {
                        writer.write(timestamp + " " + Thread.currentThread().getName());
                        Thread.sleep(1000);
                    }
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

    public static void setStatus(boolean status) {
        Consumer.status = status;
    }

    public static boolean isStatus() {
        return status;
    }
}
