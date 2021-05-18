package com.rakovets.course.java.core.practice.concurrency;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;

public class Consumer extends Thread {
    private final Path FILE_PATH = Paths.get("src", "main", "resources", "practice", "ThreadsData.txt");
    private boolean isAlive = true;

    public Consumer(String name) {
        super(name);
    }

    public void kill() {
        isAlive = false;
    }

    public void run() {
        while (isAlive) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.valueOf(FILE_PATH), true));
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                if (Container.getTerminalCollector().size() > 0) {
                    int sleepTime = Container.getFromQueue();
                    sleep(sleepTime * 1000L);
                    bufferedWriter.write(timestamp + " " +  getName() + " I slept " + sleepTime + " seconds");
                } else {
                    int sleepTime = 1;
                    sleep(sleepTime * 1000L);
                    bufferedWriter.write(timestamp + " " + getName() + " I slept " + sleepTime + " second");
                }
                bufferedWriter.newLine();
                bufferedWriter.flush();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
