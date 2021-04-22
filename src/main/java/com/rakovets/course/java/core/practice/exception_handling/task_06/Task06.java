package com.rakovets.course.java.core.practice.exception_handling.task_06;

import java.util.Random;

public class Task06 {
    public static void randomException() {
        Random random = new Random();
        int randomException = random.nextInt(3);
        switch (randomException) {
            case 0:
                throw new NullPointerException();
            case 1:
                throw new ArrayIndexOutOfBoundsException();
            case 2:
                throw new ArithmeticException();
        }
    }
}

