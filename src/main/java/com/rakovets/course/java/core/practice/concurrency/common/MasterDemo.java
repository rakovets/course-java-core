package com.rakovets.course.java.core.practice.concurrency.common;

import java.util.Scanner;

public class MasterDemo extends Exception {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);

        int x = 1;
        try {
            do {
                x++;
            } while (x > 0);
        } catch (Exception UserInputException) {
            UserInputException.printStackTrace();
        }
    }
}

