package com.rakovets.course.java.core.practice.exception_handling;

public class Task4 {
    public String[] getArray(String str) {
        if (str == null) {
            throw new NullStringException("Строка пустая");
        }
        return str.split(" ");
    }
}
