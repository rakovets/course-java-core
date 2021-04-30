package com.rakovets.course.java.core.practice.exception_handling;

public class Task07 {
    public static void throwExceptionHalfTheTime() {
        try {
            int number = (int) (Math.random() * 2);
            if (number == 0) {
                throw new NullPointerException();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
