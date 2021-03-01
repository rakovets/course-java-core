package com.rakovets.course.java.core.practice.concurrency.common;

import java.util.LinkedList;
import java.util.Scanner;

public class Master implements Runnable {
    private final LinkedList<Integer> list;

    public Master(LinkedList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        Scanner numInput = new Scanner(System.in);

        int num = 0;
        while (num != -1) {
            System.out.println("Enter your number");
            try {
                int nextInt = numInput.nextInt();

                if (num == -1) {
                    list.add(num);
                    System.out.println("The app is closed");
                } else if (num >= 0) {
                    list.add(num);
                } else {
                    try {
                        throw new UserInputException("Negative value is entered");
                    } catch (UserInputException e) {
                        System.out.println(e.getMessage());
                    }
                }
            } finally {
                System.out.println("Incorrect app work");
            }
        }
    }
}

