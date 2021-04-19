package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Random;

public class Task06 {
    public static void randomException() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        switch (randomNumber) {
            case 0:
                throw new NullPointerException();
            case 1:
                throw new ArrayIndexOutOfBoundsException();
            case 2:
                throw new ArithmeticException();
        }
    }
}
