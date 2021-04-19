package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Random;

public class Task07 {
    public static void random() throws Exception {
        Random random = new Random();
        int randomNumber = random.nextInt(2);

        if (randomNumber == 0) {
            throw new ArithmeticException();
        }
    }
}


