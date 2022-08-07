package com.rakovets.course.java.core.practice.concurrency;

import java.util.Queue;
import java.util.Scanner;

public class Producer implements Runnable {
    private Queue<Integer> integerNumbersQueue;

    public Producer(QueueOfIntegerNumbers queueOfIntegerNumbers) {
        integerNumbersQueue = queueOfIntegerNumbers.getQueue();
    }

    @Override
    public void run() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter integer number: ");
            try {
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    if (number != -1) {
                        integerNumbersQueue.offer(number);
                    } else {
                        break;
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
