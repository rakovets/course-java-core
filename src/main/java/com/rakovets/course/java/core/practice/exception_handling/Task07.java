package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Random;

public class Task07 {
    public static void fiftyPercentException() throws Exception {
        Random fiftyPercentException = new Random();
        int randomNumber = fiftyPercentException.nextInt(2);

        if (randomNumber == 0) {
            throw new ArithmeticException();
        }
    }
}
