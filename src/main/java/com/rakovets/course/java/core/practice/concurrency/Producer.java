package com.rakovets.course.java.core.practice.concurrency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Producer implements Runnable {
    private static LinkedList<Integer> queue = new LinkedList<>();

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while (!line.equals("-1")) {
            try {
                line = reader.readLine();
                int delay = Integer.parseInt(line);
                if (delay == -1) {
                    Consumer.setStatus(false);
                    break;
                } else if (delay < -1) {
                    throw new UserInputException();
                } else {
                    queue.addLast(delay);
                }
            } catch (UserInputException | NumberFormatException | IOException exception) {
                exception.printStackTrace();
            }
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LinkedList<Integer> getQueue() {
        return queue;
    }
}
