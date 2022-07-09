package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task07;

public class Task07Demo {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 5;

        String exception;

        try {
            exception = String.valueOf(Task07.division(firstNumber, secondNumber));
        } catch (Exception e) {
            exception = e.getMessage();
        } finally {
            System.out.print("\n");
        }
        System.out.println(exception);
    }
}
