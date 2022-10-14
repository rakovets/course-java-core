package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ExceptionTask05;

public class Task05 {
    public void checkExceptionTask05(String inputValue) {
        try {
            if (inputValue == null) {
                throw new NullPointerException();
            }
        } catch (RuntimeException exception) {
            throw new ExceptionTask05("Method was failed. Reason: " + exception.getMessage());
        }
    }
}
