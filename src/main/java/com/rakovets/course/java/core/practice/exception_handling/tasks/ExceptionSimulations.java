package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.CustomException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.CustomRuntimeException;

public class ExceptionSimulations {
    public void callNullPointerException() {
        String someString = null;
        someString.length();
    }

    public void callArrayIndexOutOfBoundsException() {
        int[] array = new int[1];
        int value = array[1];
    }

    public void callCustomException() throws CustomException {
        throw new CustomException();
    }

    public void callCustomRuntimeException() {
        throw new CustomRuntimeException("stack trace");
    }

    public void callIllegalAccessException() throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    public Exception[] callThreeExceptions() {
        Exception[] exceptionArray = new Exception[4];

        try {
            throw new CustomException();
        } catch (CustomException customException) {
            exceptionArray[0] = customException;
        }

        try {
            throw new CustomRuntimeException("stack trace");
        } catch (CustomRuntimeException customRuntimeException) {
            exceptionArray[1] = customRuntimeException;
        }

        try {
            throw new IllegalAccessException();
        } catch (IllegalAccessException illegalAccessException) {
            exceptionArray[2] = illegalAccessException;
        }

        return exceptionArray;
    }
}
