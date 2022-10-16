package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.NullStringExceptionTask4;


public class Task4 {
    public static void getNullStringExceptionTask4(String string) throws NullStringExceptionTask4 {
        if (string == null) {
            throw new NullStringExceptionTask4("Program is over");
        }
    }
}
