package com.rakovets.course.java.core.practice.exception_handling.tasks;

public class Task07 {
    public static void throwExceptionMultiple() {
        int number = (int) (Math.random() * 3);
        if (number == 0) {
            throw new NullPointerException();
        }
    }
}
