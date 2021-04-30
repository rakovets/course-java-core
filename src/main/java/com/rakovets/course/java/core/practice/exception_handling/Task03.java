package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.MyException;

public class Task03 {
    public static void throwMyException() throws MyException {
        throw new MyException("My Exception\n");
    }
}
