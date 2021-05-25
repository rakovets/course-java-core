package com.rakovets.course.java.core.practice.concurrency;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;

public class Consumer implements Runnable {
    Path filePath = Paths.get("src", "main", "resources", "practice", "concurrency.txt");

    public void run() {
        System.out.println("Consumer started.");
        while (true) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(filePath), true))) {
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                if (Storage.getNumberStorage().peek() != null) {
                    int inputNumber = Storage.getNumberStorage().poll();
                    Thread.sleep(inputNumber * 1000);
                    writer.write(timestamp + " " + Thread.currentThread().getName() + "I slept " + inputNumber + " seconds\n");
                } else {
                    Thread.sleep(1000);
                    writer.write(timestamp + " " + Thread.currentThread().getName() + " ...\n");
                }
                writer.flush();
            } catch (InterruptedException | IOException | NullPointerException ex) {
                ex.printStackTrace();
            }
            if (Storage.isIsRun() == false) {
                System.out.println("Consumer finished.");
                break;
            }
        }
    }
}
