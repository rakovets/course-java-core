package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ExceptionTask07;

public class Task07 {
    public void checkDivider(int inputValue, int divider) throws ExceptionTask07, ArithmeticException {
        if (inputValue > 1_000_000) {
            throw new ExceptionTask07("Input value should be less than 1 million");
        }
        if (divider == 0) {
            throw new ArithmeticException("You can't divide input value on divider");
        }
    }
}

