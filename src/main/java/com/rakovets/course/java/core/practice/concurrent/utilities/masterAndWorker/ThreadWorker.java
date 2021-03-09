package com.rakovets.course.java.core.practice.concurrent.utilities.masterAndWorker;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

public class ThreadWorker extends Thread {
    private volatile List<Integer> listOfNumbers;
    private boolean isActive;

    public ThreadWorker(List<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
        this.isActive = true;
    }

    @Override
    public void run() {
        int counter = 0;
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        while (isActive) {
            try (FileWriter writer = new FileWriter("src/test/java/resources/practice/concurrent/utilities/masterWorker/worker.txt", true)) {
                if (counter == listOfNumbers.size()) {
                    Thread.sleep(1000);
                    writer.write(timestamp + " - ...\n");
                }
                if (counter < listOfNumbers.size() && listOfNumbers.get(counter) != -1) {
                    Thread.sleep(listOfNumbers.get(counter) * 1000);
                    writer.write(timestamp + " - I slept " + listOfNumbers.get(counter) + " seconds\n");
                    counter++;
                } else if (counter < listOfNumbers.size() && listOfNumbers.get(counter) == -1) {
                    isActive = false;
                }
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}
