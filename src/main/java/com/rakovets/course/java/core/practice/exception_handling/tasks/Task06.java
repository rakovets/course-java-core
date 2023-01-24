package com.rakovets.course.java.core.practice.exception_handling.tasks;

import java.util.Random;

public class Task06 {
    public static void randomException() throws Exception {
    Random random = new Random();
    int randomException = random.nextInt(3);
    switch (randomException) {
        case 0:
            throw new NullPointerException();
        case 1:
            throw new ArrayIndexOutOfBoundsException();
        default:
            throw new NoSuchMethodException();
    }
    }
}
