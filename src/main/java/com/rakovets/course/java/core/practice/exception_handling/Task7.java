package com.rakovets.course.java.core.practice.exception_handling;

public class Task7 {
    static int random = 1 + (int) (Math.random() * 2);

    public static int willOrNot() throws NullPointerException {
        if (random == 1) {
            throw new NullPointerException("u are not lucky");
        } else
            return random;
    }
}
