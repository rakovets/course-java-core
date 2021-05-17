package com.rakovets.course.java.core.practice.concurrency.threads;

import com.rakovets.course.java.core.practice.concurrency.OutputMessages;
import com.rakovets.course.java.core.practice.concurrency.UserInputException;
import java.util.*;

public class Producer implements Runnable {
    private final Scanner cin = new Scanner(System.in);

    @Override
    public void run() {
        OutputMessages.startThreadMessage(Thread.currentThread());
            while (true) {
                try {
                    int number = cin.nextInt();
                    if (number == -1) {
                        break;
                    }
                    ReadQueueAndWriteAtFile.listOfNumbers.add(number);
                } catch (InputMismatchException ex) {
                    throw new UserInputException("Wrong input");
                }
            }
        System.out.printf("%s\n", ReadQueueAndWriteAtFile.getListOfNumbers());
        OutputMessages.endThreadMessage(Thread.currentThread());
    }
}
