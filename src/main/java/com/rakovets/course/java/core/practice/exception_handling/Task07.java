package com.rakovets.course.java.core.practice.exception_handling;

public class Task07 {
    public static void throwExceptionHalfTheTime() {
        int number = (int) (Math.random() * 2);
        if (number == 0) {
            throw new NullPointerException();
        }
    }
}
