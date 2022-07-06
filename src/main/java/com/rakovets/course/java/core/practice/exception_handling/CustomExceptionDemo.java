package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentNegativeException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomExceptionDemo {
    Logger logger = Logger.getLogger(CustomExceptionDemo.class.getName());
    CustomExceptionTask task = new CustomExceptionTask();

    public void catchArgumentNegativeException(int number) {
        try {
            task.verifyPositiveArgument(number);
        } catch (ArgumentNegativeException exception) {
            logger.log(Level.SEVERE, "Enter a positive number");
            exception.printStackTrace();
        }
    }
}
