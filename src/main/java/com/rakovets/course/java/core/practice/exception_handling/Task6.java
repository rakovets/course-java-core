package com.rakovets.course.java.core.practice.exception_handling;

public class Task6 {
    public void randomException(int num) {
        if (num >= 0 && num < 30) {
            throw new ArithmeticException();
        } else if (num >= 30 && num < 60) {
            throw new NullPointerException();
        } else {
            throw new NumberFormatException();
        }
    }
}
