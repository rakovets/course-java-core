package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.NegativeNumberException;

public class Task4 {
    private int num;
    private final int MIN_NUM = 0;

    public int negativeNumberException(int num) throws NegativeNumberException {
        if (num < MIN_NUM) {
            throw new NegativeNumberException("ERROR !!! number should be more 'zero'");
        }
        this.num = num;
        return num;
    }
}
