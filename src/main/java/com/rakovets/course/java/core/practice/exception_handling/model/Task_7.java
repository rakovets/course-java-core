package com.rakovets.course.java.core.practice.exception_handling.model;

public class Task_7 {
    public static int getException() {
        int x = (Math.random() < 0.5 ? 0 : 1);
        return 1 / x;
    }
}
