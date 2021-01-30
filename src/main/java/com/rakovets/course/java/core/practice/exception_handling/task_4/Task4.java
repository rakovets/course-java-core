package com.rakovets.course.java.core.practice.exception_handling.task_4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        try {
            System.out.println(new Task4().getDivide(a, b));
        } catch (DividerException de) {
            de.printStackTrace();
        }
    }

    public double getDivide(double a, double b) throws DividerException {
        if (b == 0) {
            throw new DividerException("Cannot be divide by zero!");
        }
        return a / b;
    }
}


