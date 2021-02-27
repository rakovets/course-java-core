package com.rakovets.course.java.core.practice.concurrency.common.master_worker;

import java.util.LinkedList;
import java.util.Scanner;

public class Master extends Thread {
    private final LinkedList<Integer> request;

    public Master(LinkedList<Integer> list) {
        this.request = list;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int key = 0;
        while (key != -1) {
            try {
                System.out.println("Enter your number: ");
                System.out.println("(To exit the program, enter '-1')");
                String string = scanner.nextLine();

                try {
                    key = Integer.parseInt(string);
                } catch (NumberFormatException ex) {
                    try {
                        throw new UserInputException("The entered value is not an integer");
                    } catch (UserInputException notInteger) {
                        System.out.println(notInteger.getMessage());
                        continue;
                    }
                }

                if (key == -1) {
                    System.out.println("The app is closing");
                    request.add(key);
                } else if (key < -1) {
                    try {
                        throw new UserInputException("Your value cannot be negative");
                    } catch (UserInputException negativeNumber) {
                        System.out.println(negativeNumber.getMessage());
                    }
                } else {
                    request.add(key);
                    System.out.println("You have entered " + key);
                }

            } catch (Exception exp) {
                try {
                    throw new UserInputException("Something went wrong");
                } catch (UserInputException custom) {
                    System.out.println(custom.getMessage());
                }
            }
        }
    }

    public LinkedList<Integer> getRequest() {
        return request;
    }
}
