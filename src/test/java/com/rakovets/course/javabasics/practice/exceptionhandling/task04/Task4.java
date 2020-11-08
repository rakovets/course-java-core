package com.rakovets.course.javabasics.practice.exceptionhandling.task04;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double result = 0;
        System.out.println("Input number for Devision");
        Scanner input = new Scanner(System.in);
        try {
            result = MyRuntime.getResultofDevision(input.nextInt());
        } catch (DevisionException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("Result of operation = " + result);

    }
}
