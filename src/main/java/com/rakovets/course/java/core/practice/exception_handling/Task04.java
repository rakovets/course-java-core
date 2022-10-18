package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ExceptionTask04;

public class Task04 {
    public void checkExceptionTask04(String string) throws ExceptionTask04 {
        if (string == null) {
            throw new ExceptionTask04("Input parameter is null");
        }
    }
}
