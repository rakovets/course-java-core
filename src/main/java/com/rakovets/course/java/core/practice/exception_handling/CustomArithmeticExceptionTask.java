package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.CustomArithmeticException;

import java.util.logging.Logger;

public class CustomArithmeticExceptionTask {
    Logger logger = Logger.getLogger(CustomArithmeticExceptionTask.class.getName());

    public void produceCustomArithmeticException(int number1, int number2) throws CustomArithmeticException {
        try {
            int result = number1 / number2;
        } catch (ArithmeticException exception) {
            throw new CustomArithmeticException(exception.getMessage());
        }
    }
}
