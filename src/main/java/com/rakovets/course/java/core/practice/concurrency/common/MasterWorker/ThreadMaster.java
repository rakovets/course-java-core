package com.rakovets.course.java.core.practice.concurrency.common.MasterWorker;

import java.util.*;

public class ThreadMaster implements Runnable {
    private final CommonResource commonResource;
    private boolean isRun = true;

    public ThreadMaster(CommonResource commonResource) {
        this.commonResource = commonResource;
    }

    Scanner scan = new Scanner(System.in);

    public void run() {
        try {
            while (isRun) {
                System.out.println("Enter any positive number:");
                int number = scan.nextInt();
                if (number == -1) {
                    isRun = false;
                    System.out.println("Program terminated");
                }
                else if (number < -1)
                    try {
                        throw new UserInputException(number);
                    } catch (UserInputException e) {
                        e.printStackTrace();
                } else {
                    commonResource.list.addLast(number);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Your input is invalid");
        }
    }
}
