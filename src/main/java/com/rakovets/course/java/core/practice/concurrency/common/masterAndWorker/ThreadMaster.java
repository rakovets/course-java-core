package com.rakovets.course.java.core.practice.concurrency.common.masterAndWorker;

import java.util.List;
import java.util.Scanner;

public class ThreadMaster extends Thread {
    private List<Integer> listOfNumbers;

    public ThreadMaster(List<Integer> listOfNumbers) {
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
                    throw new UserInputException("Error number. Try again");
                } catch (UserInputException ex) {
                    ex.printStackTrace();
                }
            }
        }
        listOfNumbers.add(-1);
        System.out.println("Master stopped");
    }
}
