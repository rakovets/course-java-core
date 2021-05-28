package com.rakovets.course.java.core.example.exception_handling.task5;

public class Task5 {
    public static void trowExceptionTask5() throws NullPointerException {
        throw new NullPointerException("MESSAGE OF NullPointerException");
    }

    public static void someExceptionMethod() throws CustomNulException {
        try {
            trowExceptionTask5();
        } catch (NullPointerException e) {
            throw new CustomNulException(e, e.getMessage());
        }
    }
}

