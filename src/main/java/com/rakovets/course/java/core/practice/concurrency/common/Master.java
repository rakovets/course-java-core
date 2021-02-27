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
        Scanner scan = new Scanner(System.in);
        int num = 0;

        while (num != -1) {
            System.out.println("Enter your value\n");

            try {
                String tempo = scan.nextLine();

                try {
                    num = Integer.parseInt(tempo);

                    if (num == -1) {
                        list.add(num);
                        System.out.println("App closed");
                    }
                    else if (num >= 0) {
                        list.add(num);
                    } else {
                        try {
                            throw new UserInputException("You can't enter negative values!");
                        } catch (UserInputException ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                } catch (Exception e) {
                    try {
                        throw new UserInputException("You can only enter integers!");
                    } catch (UserInputException eu) {
                        System.out.println(eu.getMessage());
                    }
                }
            } catch (Exception ex) {
                try {
                    throw new UserInputException("Something goes wrong...try again");
                } catch (UserInputException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
