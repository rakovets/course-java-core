package com.rakovets.course.java.core.practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Producer implements Runnable {
    private LinkedList<Integer> queue;

    public Producer(LinkedList<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int delay = Integer.parseInt(scanner.nextLine());
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
}
