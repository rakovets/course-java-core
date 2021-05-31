package com.rakovets.course.java.core.practice.concurrent_utilities;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

public class Master implements Runnable {
    private CommonResource commonResource;
    private ReentrantLock locker;

    public Master(CommonResource commonResource, ReentrantLock locker) {
        this.commonResource = commonResource;
        this.locker = locker;
    }

    @Override
    public void run() {
        System.out.println("Program started.");
        Scanner scanner = new Scanner(System.in);
        Integer numberInteger;
        while (commonResource.isStatus()) {
            locker.lock();
            try {
                int number = scanner.nextInt();
                if (number == -1) {
                    commonResource.addNumber(number);
                    commonResource.setStatus();
                    System.out.println("Program finished.");
                    locker.unlock();
                    break;
                } else if (number < -1) {
                    throw new UserInputException("The input value should be greater then 0!");
                } else {
                    numberInteger = number;
                    commonResource.addNumber(numberInteger);
                }
            } catch (UserInputException ex) {
                try {
                    throw new UserInputException("Incorrect data!");
                } catch (UserInputException e) {
                    e.printStackTrace();
                }
            } finally {
                locker.unlock();
            }
        }
    }
}
