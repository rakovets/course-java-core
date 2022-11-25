package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ZeroCheckException;

public class Task04 {
    public int calculatorDividing(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ZeroCheckException("You cannot divide by zero!");
        } else {
            return dividend / divisor;
        }
    }
}
