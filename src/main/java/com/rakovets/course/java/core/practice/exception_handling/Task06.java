package com.rakovets.course.java.core.practice.exception_handling;

public class Task06 extends Exception {

    public Task06() {
    }

    public static int throwException(String text) {
        if (text == null) {
            getRandException();
        }
        return text.length();
    }

    static int getRandom(int min, int max) {
        int randValue = min + (int)(Math.random() * ((max - min) + 1));
        return randValue;
    }

    public static void getRandException() {
        int randValue = getRandom(1,3);
        if (randValue == 1) {
            throw new ArithmeticException("This is ArithmeticException");
        } else if (randValue == 2) {
            throw new NullPointerException("This is NullPointerException");
        } else {
            throw new IndexOutOfBoundsException("This is IndexOutOfBoundsException");
        }
    }
}
