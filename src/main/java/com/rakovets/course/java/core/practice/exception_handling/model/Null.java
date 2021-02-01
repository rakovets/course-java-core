package com.rakovets.course.java.core.practice.exception_handling.model;

import com.rakovets.course.java.core.practice.exception_handling.exception.NullException;

public class Null {
    public static int getStringLength(String string) throws NullException {
        try {
            return string.length();
        } catch (NullPointerException ex) {
            throw new NullException("Null is defined");
        }
    }
}
