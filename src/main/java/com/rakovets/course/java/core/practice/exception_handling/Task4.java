package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.DerivativeFromRunTimeException;

public class Task4 {
    void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Result of division: " + a / b);
        } else {
            throw new DerivativeFromRunTimeException("You can not divide by zero!");
        }
    }
}
