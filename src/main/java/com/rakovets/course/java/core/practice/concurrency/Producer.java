package com.rakovets.course.java.core.practice.concurrency;

import java.util.Scanner;

public class Producer implements Runnable {
    @Override
    public void run() {
        System.out.println("Program started.");
        Scanner scanner = new Scanner(System.in);
        Integer numberInteger;
        while (true) {
            try {
                int number = scanner.nextInt();
                if (number == - 1) {
                    Storage.addNumber(-1);
                    Storage.setIsRun(false);
                    System.out.println("Program finished.");
                    break;
                } else if (number < 0) {
                    throw new UserInputException("The input value should be greater then 0!");
                } else {
                    numberInteger = number;
                    Storage.addNumber(numberInteger);
                }
            } catch (UserInputException ex) {
                throw new UserInputException("Incorrect data!");
            }
        }
    }
}
