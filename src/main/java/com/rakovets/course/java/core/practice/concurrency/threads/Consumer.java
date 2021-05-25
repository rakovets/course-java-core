package com.rakovets.course.java.core.practice.concurrency.threads;

import com.rakovets.course.java.core.practice.concurrency.OutputMessages;
import com.rakovets.course.java.core.practice.concurrency.UsedPaths;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Deque;

public class Consumer implements Runnable {
    UsedPaths usedPaths = new UsedPaths();

    public void run() {
        OutputMessages.startThreadMessage(Thread.currentThread());
        Deque<Integer> listOfNumbers = SharedResource.getListOfNumbers();

        while (true) {
            try {
                FileWriter writer = new FileWriter(String.valueOf(usedPaths.getPathToConsumerWorkResult()), true);
                if (listOfNumbers.size() > 0) {
                    if (listOfNumbers.element() == -1) {
                        break;
                    }
                    Thread.sleep(listOfNumbers.element() * 1000L);
                    writer.write(LocalDateTime.now() + " " + Thread.currentThread().getName() + " - I slept" + " " +
                            listOfNumbers.element() + " seconds\n");
                    listOfNumbers.removeFirst();
                } else {
                    Thread.sleep(1000L);
                    writer.write(LocalDateTime.now() + " " + Thread.currentThread().getName() + " ...\n");
                }
                writer.flush();
            } catch (IOException | InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        OutputMessages.endThreadMessage(Thread.currentThread());
    }
}
