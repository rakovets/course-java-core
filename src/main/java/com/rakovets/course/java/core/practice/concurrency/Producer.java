package com.rakovets.course.java.core.practice.concurrency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.InvalidPropertiesFormatException;
import java.util.PriorityQueue;
import java.util.Queue;

public class Producer {
    Queue queue = new PriorityQueue();

    public void reader() throws IOException, UserInputException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        while ((!line.equals("-1"))) {
            line = reader.readLine();
            try {
                int delay = Integer.parseInt(line);
                if (delay == -1) {
                    break;
                } else if (delay < -1) {
                    throw new UserInputException();
                } else {
                    queue.add(delay);
                }
            } catch (UserInputException | NumberFormatException exception) {
                exception.printStackTrace();
            }
        }
    }
}
