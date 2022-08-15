package com.rakovets.course.java.core.practice.concurrency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Queue;
import java.util.logging.Logger;

public class Producer extends Thread {
    private final Queue<Integer> queue;
    Logger logger = Logger.getLogger(Producer.class.getName());

    public Producer(Queue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        String inputString;
        try (BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.print("Enter Integer Number: ");
                inputString = bufferRead.readLine();
                if (!inputString.matches("-?[\\d]+")) {
                    logger.severe("Only Integer Number!");
                    continue;
                }
                if (Objects.equals(inputString, "-1")) {
                    return;
                }
                queue.add(Integer.valueOf(inputString));
                System.out.println(queue);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
