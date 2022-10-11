package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.EmptyStringException;

public class Task05 {
    public String getStringLength(String str) throws EmptyStringException {
        try {
            if (str == null) {
                throw new  NullPointerException();
            }
        } catch (NullPointerException e) {
            throw new EmptyStringException("Your string leads nowhere");
        }
        return "String length is " + String.valueOf(str.length());
    }
}
