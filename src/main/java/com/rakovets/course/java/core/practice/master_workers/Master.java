package com.rakovets.course.java.core.practice.master_workers;

import com.rakovets.course.java.core.practice.exceptions.UserInputException;

import java.util.List;
import java.util.Scanner;

public class Master extends Thread {
    private List<Integer> listOfNumbers;

    public Master(List<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String numbers = "";
        while (!(numbers.equals("-1"))) {
            try {
                numbers = scanner.next();
                listOfNumbers.add(Integer.parseInt(numbers));
            } catch (Exception e) {
                try {
                    throw new UserInputException("Error input");
                } catch (UserInputException ex) {
                    ex.printStackTrace();
                }
            }
        }
        listOfNumbers.add(-1);
    }
}
