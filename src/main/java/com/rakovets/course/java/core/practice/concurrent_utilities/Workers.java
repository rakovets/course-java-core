package com.rakovets.course.java.core.practice.concurrent_utilities;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.concurrent.locks.ReentrantLock;

public class Workers implements Runnable {
    Path filePath = Paths.get("src", "main", "resources", "practice", "concurrent.txt");
    private CommonResource commonResource;
    private ReentrantLock locker;

    public Workers(CommonResource commonResource, ReentrantLock locker) {
        this.commonResource = commonResource;
        this.locker = locker;
    }

    @Override
    public void run() {
        System.out.println("Workers started.");
        while (true) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(filePath), true))) {
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                locker.lock();
                if (!commonResource.isEmptyCommonResource()) {
                    if (commonResource.getElementFromCommonResource() == -1) {
                        locker.lock();
                        commonResource.setStatus();
                        locker.unlock();
                        break;
                    } else {
                        int inputNumber = commonResource.getElementFromCommonResource();
                        Thread.sleep(inputNumber * 1000);
                        writer.write(timestamp + " " + Thread.currentThread().getName() + "I slept " + inputNumber + " seconds\n");
                        commonResource.removeFirstElement();
                        locker.unlock();
                    }
                } else {
                    Thread.sleep(1000);
                    writer.write(timestamp + " " + Thread.currentThread().getName() + " ...\n");
                    locker.unlock();
                }
                writer.flush();
            } catch (InterruptedException | IOException | NullPointerException ex) {
                ex.printStackTrace();
            }
            System.out.println("Workers finished.");
        }
    }
}
