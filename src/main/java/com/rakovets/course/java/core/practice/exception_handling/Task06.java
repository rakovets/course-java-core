package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Random;

public class Task06 {
    public static void throwRandomException() {
        Random randomException = new Random();
        int randomNumber = randomException.nextInt(3);
        switch (randomNumber) {
            case 0:
                throw new ArrayIndexOutOfBoundsException();
            case 1:
                throw new ArithmeticException();
            case 2:
                throw new NullPointerException();
        }
    }
}
