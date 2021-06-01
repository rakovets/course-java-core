package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Master implements Runnable {
    private final CopyOnWriteArrayList<Integer> arrayList;


    public Master(CopyOnWriteArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while (input != -1) {
            try {
                System.out.println("Enter number: ");
                String number = scanner.nextLine();
                try {
                    input = Integer.parseInt(number);
                } catch (NumberFormatException e) {
                    try {
                        throw new UserInputException("You entered the wrong number");
                    } catch (UserInputException ex) {
                        System.out.println(ex.getMessage());
                        continue;
                    }
                }
                if (input == -1) {
                    System.out.println("The enter is closing");
                    arrayList.add(input);
                }
            } catch (Exception exception) {
                try {
                    throw new UserInputException("UserInputException");
                } catch (UserInputException userInputException) {
                    System.out.println(userInputException.getMessage());
                }
            }
        }
    }
}
