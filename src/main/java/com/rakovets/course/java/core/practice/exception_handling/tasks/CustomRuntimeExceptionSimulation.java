package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.CustomRuntimeException;

public class CustomRuntimeExceptionSimulation {
    public void callException() {
        throw new CustomRuntimeException("stack trace");
    }

}
