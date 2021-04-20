package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.example.exception_handling.exception.OutOfRangeRuntimeException;

public class Task04 {
    public static void outOfRangeRuntimeException() throws OutOfRangeRuntimeException {
        throw new OutOfRangeRuntimeException("Time is out of range");
    }
}
