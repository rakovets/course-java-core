package com.rakovets.course.java.core.practice.exception_handling;

public class Task4 {
    public static String[] getArray(String str) throws NullStringException {
        if (str == null) {
            throw new NullStringException("Строка пустая");
        }
        return str.split(" ");
    }
}
