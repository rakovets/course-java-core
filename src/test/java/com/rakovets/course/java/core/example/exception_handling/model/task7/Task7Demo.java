package com.rakovets.course.java.core.example.exception_handling.model.task7;

import com.rakovets.course.java.core.example.exception_handling.task7.Custom50PercentExceprion;

public class Task7Demo {
    public static void main(String[] args) {
        try {
            Custom50PercentExceprion.custom50Percent();
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Fix this problem!!!");
        }
    }
}
