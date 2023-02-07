package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.CustomException;

public class CustomExceptionSimulation {
    public void callException() throws CustomException {
        throw new CustomException();
    }
}
