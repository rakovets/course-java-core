package com.rakovets.course.javabasics.practice.concurrency;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MasterWorker extends Thread {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        while (true) {
            try {
                try {
                    System.out.println("Insert a number: ");
                    num = Integer.parseInt(input.nextLine());
                    if (num == -1) {
                        System.out.println("Exit");
                        break;
                    }
                    System.out.println("I slept " + num + " seconds");
                    sleep(num * 1000);
                } catch (NumberFormatException e) {
                    throw new InputMismatchException("Data is incorrect!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
