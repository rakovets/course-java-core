package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.CustomException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.CustomRuntimeException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.NumberIsNotValidException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.NumberIsValidException;

import java.lang.reflect.Executable;

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

    public void callThreeExceptions(int number) {
        if (number < 0) {
            throw new NumberIsNotValidException("Number less than zero");
        }
        if (number == 0) {
            throw new NumberIsNotValidException("Number is zero");
        }
        throw new NumberIsValidException("Number more than zero");
    }

    public void callTwoExceptions(int number) throws CustomException {
        if (number == 0) {
            throw new CustomException();
        }
        if (number > 0) {
            throw new NumberIsNotValidException("Number more than zero");
        }
    }
}
