package com.rakovets.course.java.core.practice.exception_handling;

public class Task4 {
        private int number;
    public int numberIsNegative(int number) {
        if (number < 0) {
            throw new NegativeNumberException("It is negative number");
        }
        return number;
    }
}
