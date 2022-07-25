package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.CustomArithmeticException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomArithmeticExceptionDemo {
    private final Logger logger = Logger.getLogger(CustomArithmeticExceptionDemo.class.getName());
    private final CustomArithmeticExceptionTask task = new CustomArithmeticExceptionTask();

    public void catchCustomArithmeticException(int number1, int number2) {
        try {
            task.produceCustomArithmeticException(number1, number2);
        } catch (CustomArithmeticException exception) {
            logger.log(Level.SEVERE, "Don't divide by zero!");
        }
    }
}
