package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.MyRuntimeException;

public class Task04 {
    public static void throwMyRuntimeException() throws MyRuntimeException {
        throw new MyRuntimeException("My Runtime Exception\n");
    }
}
