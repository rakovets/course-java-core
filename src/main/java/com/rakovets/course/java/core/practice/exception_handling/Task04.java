package com.rakovets.course.java.core.practice.exception_handling;

public class Task04 extends RuntimeException {

    public Task04() {
        super("Error");
    }

    public static int throwException(String text) throws Exception {
        if (text == null) {
            throw new Task04();
        }
       return text.length();
    }
}
