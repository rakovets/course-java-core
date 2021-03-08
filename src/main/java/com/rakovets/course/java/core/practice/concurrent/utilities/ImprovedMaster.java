package com.rakovets.course.java.core.practice.concurrent.utilities;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class ImprovedMaster implements  Runnable {
    private final CopyOnWriteArrayList<Integer> list1;

    public ImprovedMaster(CopyOnWriteArrayList<Integer> list2) {
        this.list1 = list2;
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
                        list1.add(num);
                        System.out.println("App closed");
                    }
                    else if (num >= 0) {
                        list1.add(num);
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
