package com.rakovets.course.java.core.practice.exception_handling;

public class Task05 {
    public static void throwOneException() {
        String string = null;
        try {
            if (string == null) {
                throw new Exception("MyNullPointerException");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
