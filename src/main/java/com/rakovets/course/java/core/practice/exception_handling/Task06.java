package com.rakovets.course.java.core.practice.exception_handling;

import java.io.FileNotFoundException;

public class Task06 {
    public static void getRandomException() throws FileNotFoundException, ArrayIndexOutOfBoundsException, NullPointerException {
        double i = Math.random();
        if (i > 0 && i <= 0.33) {
            throw new FileNotFoundException();
        } else if (i > 0.33 && i <= 0.66) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            throw new NullPointerException();
        }
    }
}
