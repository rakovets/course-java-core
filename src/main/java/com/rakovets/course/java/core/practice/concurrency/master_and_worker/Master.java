package com.rakovets.course.java.core.practice.concurrency.master_and_worker;

import java.util.List;
import java.util.Scanner;

public class Master extends Thread{

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while (!(input == -1)) {
            try {
                input = scanner.nextInt();
                SharedResources.integerList.add(input);
            } catch (Exception e) {
                try {
                    throw new UserInputException("Wrong number");
                } catch (UserInputException userInputException) {
                    System.out.println(userInputException.getMessage());
                }
            }
        }
        SharedResources.integerList.add(-1);
    }
}
