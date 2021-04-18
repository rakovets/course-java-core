package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Random;

public class Task06 {
    public void randomException() throws ArithmeticException, NullPointerException, RuntimeException {
        switch ((int) (Math.random() * 3)) {
            case 1:
                throw new ArithmeticException();
            case 2:
                throw new NullPointerException();
            default:
                throw new RuntimeException();
        }
    }
}
