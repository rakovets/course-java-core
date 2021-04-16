package com.rakovets.course.java.core.practice.exception_handling;

public class Task07 {

    public static int throwException(String text) throws Exception {
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
        int randValue = getRandom(1,2);
        if (randValue == 1) {
            throw new NullPointerException("This is NullPointerException");
        }
    }
}
