package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.practice.concurrency.exceptions.UserInputException;
import static com.rakovets.course.java.core.practice.concurrency.IntegerQueue.fullNumbers;

import java.util.*;

public class Producer implements Runnable {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        while (true) {
            try {
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    if (number == -1) {
                        break;
                    } else {
                        fullNumbers.add(number);
                    }
                } else {
                    throw new UserInputException();
                }
            } catch (UserInputException | InputMismatchException | MissingFormatArgumentException e) {
                e.printStackTrace();
                scanner.nextLine();
                scanner.nextLine();
            }
        }
        System.out.println("Number of items in the queue " + fullNumbers.size());
    }
}
