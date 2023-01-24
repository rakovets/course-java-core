package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exception.EmptyStringException;

public class Task05 {
    public static String getCharAt(String str) throws EmptyStringException {
        int numberChar = 0;
        try {
            if (str == null) {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            throw new EmptyStringException("You strings is empty");
        }
        return "The char on this position is:" + String.valueOf(str.charAt(numberChar));
    }
}
