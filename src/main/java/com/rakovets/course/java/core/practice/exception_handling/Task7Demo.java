package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.model.Task_7;

public class Task7Demo {
    public static void main(String[] args) {
        try {
            Task_7.getException();
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Program is over");
        }
    }
}
