package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.customExceptions.CustomRuntimeException;

public class Task04 {
    public void throwCustomRuntimeException() throws CustomRuntimeException {
     throw new CustomRuntimeException("RuntimeException test");
    }
}
