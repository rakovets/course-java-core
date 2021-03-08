package com.rakovets.course.java.core.practice.concurrency.common.master_worker;

import java.util.Scanner;

public class MasterThread implements Runnable {
    private final CommonResource comRes;
    private boolean isAlive;

    public MasterThread(CommonResource comRes) {
        this.comRes = comRes;
        isAlive = true;
    }
    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        String inputString;
        int inputNumber;
        while (isAlive) {
            inputString = scan.nextLine();
            try {
                inputNumber = Integer.parseInt(inputString);
            } catch (NumberFormatException e) {
                try {
                    throw new UserInputException("Not a number");
                } catch (UserInputException e1) {
                    System.err.println(e1.getMessage());
                    continue;
                }
            }
            if (inputNumber == -1) {
                comRes.queue.add(inputNumber);
                isAlive = false;
            } else if (inputNumber < -1) {
                try {
                    throw new UserInputException("Input a positive number");
                } catch (UserInputException e2) {
                    System.out.println(e2.getMessage());
                }
            } else {
                comRes.queue.add(inputNumber);
            }
        }
    }
}

