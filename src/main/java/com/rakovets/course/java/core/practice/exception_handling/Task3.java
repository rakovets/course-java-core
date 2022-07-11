package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.NumberIsOverHundredException;

public class Task3 {
    private int num;
    private final int MAX_NUM = 100;

    public int numberIsOverHundred(int num) throws NumberIsOverHundredException {
        if (num > MAX_NUM) {
            throw new NumberIsOverHundredException();
        }
        this.num = num;
        return num;
    }
}
