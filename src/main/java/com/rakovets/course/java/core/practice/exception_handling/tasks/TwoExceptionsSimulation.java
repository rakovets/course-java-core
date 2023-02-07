package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.CustomException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.NumberIsNotValidException;

public class TwoExceptionsSimulation {
    public void callException(int number) throws CustomException {
        if (number == 0) {
            throw new CustomException();
        }
        if (number > 0) {
            throw new NumberIsNotValidException("Number more than zero");
        }
    }
}
