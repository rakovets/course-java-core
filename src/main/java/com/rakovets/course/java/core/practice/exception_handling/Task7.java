package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentPositiveException;

public class Task7 {
    public void getPositiveNumber(int number) throws ArgumentPositiveException {
        if (number > 0) {
            throw new ArgumentPositiveException("It's positive number");
        } else {
            throw new RuntimeException("I have difficulties with exceptions");
        }
    }
}
