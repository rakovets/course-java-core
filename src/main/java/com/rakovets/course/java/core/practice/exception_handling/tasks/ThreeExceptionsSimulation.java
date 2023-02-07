package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.NumberIsLessThanZeroException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.NumberIsMoreThanZeroException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.NumberIsValidException;

public class ThreeExceptionsSimulation {
    public void callExceptions(int number) {
        if (number < 0) {
            throw new NumberIsLessThanZeroException("Number less than zero");
        } else if (number > 0) {
            throw new NumberIsMoreThanZeroException("Number more than zero");
        } else {
            throw new NumberIsValidException("Number is zero");
        }
    }
}
