package com.rakovets.course.java.core.practice;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Producer implements Runnable {
    private static CopyOnWriteArrayList<Integer> queue = new CopyOnWriteArrayList<>();

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int delay = scanner.nextInt();
                if (delay == -1) {
                    Consumer.setStatus(false);
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

    public static CopyOnWriteArrayList<Integer> getQueue() {
        return queue;
    }
}
