package com.rakovets.course.java.core.practice.concurrency.threads;

import com.rakovets.course.java.core.practice.concurrency.OutputMessages;
import com.rakovets.course.java.core.practice.concurrency.UsedPaths;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Queue;

public class Consumer implements Runnable {
    UsedPaths usedPaths = new UsedPaths();

    public void run() {
        OutputMessages.startThreadMessage(Thread.currentThread());
        Queue<Integer> listOfNumbers = ReadQueueAndWriteAtFile.getListOfNumbers();
        try {
            FileWriter writer = new FileWriter(String.valueOf(usedPaths.getPathToConsumerWorkResult()), true);
            if (listOfNumbers.size() > 0) {
                for (int numbers : listOfNumbers) {
                    OutputMessages.sleepMessage(Thread.currentThread(), numbers);
                    Thread.sleep(numbers * 1000L);
                    writer.write(LocalDateTime.now() + " " + Thread.currentThread().getName() + " - I slept" + " " +
                            numbers + " seconds\n");
                    OutputMessages.awakeMessage(Thread.currentThread());
                }
            } else {
                OutputMessages.sleepMessage(Thread.currentThread(), 1);
                Thread.sleep(1000L);
                writer.write(LocalDateTime.now() + " " + Thread.currentThread().getName() + " ...\n");
                OutputMessages.awakeMessage(Thread.currentThread());
            }
            writer.flush();
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
        OutputMessages.endThreadMessage(Thread.currentThread());
    }
}
