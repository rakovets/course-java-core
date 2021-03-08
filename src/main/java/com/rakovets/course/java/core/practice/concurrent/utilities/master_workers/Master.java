package com.rakovets.course.java.core.practice.concurrent.utilities.master_workers;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Master implements Runnable {
    private final CopyOnWriteArrayList<Integer> request;

    public Master(CopyOnWriteArrayList<Integer> list) {
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

    public CopyOnWriteArrayList<Integer> getRequest() {
        return request;
    }
}
