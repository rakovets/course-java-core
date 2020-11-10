package com.rakovets.course.javabasics.practice.concurrency;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MasterWorker extends Thread {

    private int num = 0;

    public void run() {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                try {
                    num = Integer.parseInt(input.nextLine());
                    if (num == -1) break;
                    sleep(num * 1000);
                    System.out.println("I slept " + num + " seconds");
                    num = 0;
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
