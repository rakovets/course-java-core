package com.rakovets.course.java.core.practice.exception_handling;

public class Task05 {
    public static int lengthReturner(String text) {
        if (text == "null") {
            throw new NullPointerException();
        }
        return text.length();
    }
}
