package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.CustomException;

public class Task7 {

    public void generateException(int number) throws RuntimeException, CustomException {
        if (number == 0) {
            throw new RuntimeException("Runtime exception");
        }
        if (number > 1) {
            throw new CustomException("The elements higher than 1");
        }
    }
}
