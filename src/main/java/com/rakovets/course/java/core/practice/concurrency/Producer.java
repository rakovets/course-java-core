package com.rakovets.course.java.core.practice.concurrency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;

public class Producer implements Runnable {
    private Queue queue;

    public Producer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        while ((!line.equals("-1"))) {
            try {
                line = reader.readLine();
                int delay = Integer.parseInt(line);
                if (delay == -1) {
                    break;
                } else if (delay < -1) {
                    throw new UserInputException();
                } else {
                    queue.add(delay);
                }
            } catch (UserInputException | NumberFormatException | IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}

