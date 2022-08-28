package com.rakovets.course.java.core.practice.concurrency;

import java.util.Queue;
import java.util.Scanner;

public class Producer implements Runnable {
    private Queue<Integer> integerQueue;

    public Producer(QueueOfInteger queueOfInteger) {
        integerQueue = queueOfInteger.getQueue();
    }

    @Override
    public void run() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter one integer number: ");
            try {
                int number = scanner.nextInt();
                if (scanner.hasNextInt()) {
                    if (number != -1) {
                        integerQueue.offer(number);
                    }
                } else {
                    throw new UserInputException("Enter only integer number!");
                }
            } catch (UserInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
