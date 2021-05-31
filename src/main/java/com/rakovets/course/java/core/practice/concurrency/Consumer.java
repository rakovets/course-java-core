package com.rakovets.course.java.core.practice.concurrency;

import static com.rakovets.course.java.core.practice.concurrency.IntegerQueue.*;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class Consumer implements Runnable {
    final int MILLISECONDS_IN_ONE_SECOND = 1000;

    @Override
    public void run() {
        while (true) {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());

            try (FileWriter fileWriter =
                         new FileWriter("src/main/resources/practice/IntegerQueue",true)) {
                if (fullNumbers.isEmpty()) {
                    fileWriter.write(timestamp + " - "
                            + Thread.currentThread().getName() + " - ... \n");
                    Thread.sleep(MILLISECONDS_IN_ONE_SECOND);
                } else {
                    Thread.sleep(fullNumbers.peekFirst() * MILLISECONDS_IN_ONE_SECOND);
                    fileWriter.write(timestamp + " - "
                            + Thread.currentThread().getName() + " - I slept "
                            + fullNumbers.peekFirst() + " seconds\n");
                    fullNumbers.pollFirst();
                }
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}
