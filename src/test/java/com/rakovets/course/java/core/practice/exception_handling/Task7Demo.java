package com.rakovets.course.java.core.practice.exception_handling;

import java.io.FileNotFoundException;

public class Task7Demo {
    public static void main(String[] args) {
        Task7 task7 = new Task7();
        int testNum1 = 10;
        int testNum2 = 60;

        try {
            task7.throwExceptionFiftyPercent(testNum1);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Final num1 = " + testNum1);
        }

        try {
            task7.throwExceptionFiftyPercent(testNum2);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Final num2 = " + testNum2);
        }
    }
}
