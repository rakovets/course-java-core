package com.rakovets.course.java.core.practice.exception_handling;

public class Task05 {
    public static void throwOneException() throws NullPointerException{
        String string = null;
        try {
            if (string == null) {
                throw new NullPointerException();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
