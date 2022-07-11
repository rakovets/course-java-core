package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.DivisionOfNumbersExcepton;

public class Task5 {
    private int first;
    private int second;

    public int divisionOfNumbers(int first, int second) {
        try {
            if (second == 0) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            throw new DivisionOfNumbersExcepton(e.getMessage());
        }
        this.first = first;
        this.second = second;
        return first / second;
    }
}
