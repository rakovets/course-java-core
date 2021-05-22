package com.rakovets.course.java.core.practice.concurrency;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.Queue;

public class Consumer implements Runnable{
    private Queue<Integer> commonResource;
    Path filePath = Paths.get("src", "main", "resources", "practice", "ThreadLog.txt");
    private static boolean status = true;

    public Consumer(Queue<Integer> commonResource) {
        this.commonResource = commonResource;
    }

    public static void setStatus(boolean status) {
        Consumer.status = status;
    }

    public static boolean isStatus() {
        return status;
    }

    public void run () {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.valueOf(filePath)));
            while (isStatus()) {
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                if (commonResource.size() != 0) {
                    int sleepTime = commonResource.poll();
                    Thread.sleep(sleepTime * 1000);
                    bufferedWriter.write(timestamp + " " + Thread.currentThread().getName() + " I slept " + sleepTime + " seconds");
                } else {
                    Thread.sleep(1000);
                    bufferedWriter.write(timestamp + " " + Thread.currentThread().getName());
                }
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException | InterruptedException e) {
                e.printStackTrace();
        }
    }
}
