package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentNegativeException;
import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentPositiveException;
import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentZeroException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiplyExceptionDemo {
    Logger logger = Logger.getLogger(MultiplyExceptionDemo.class.getName());
    MultiplyExceptionTask task = new MultiplyExceptionTask();

    public void catchMultiplyExceptions(int number) {
        try {
            task.produceMultiplyExceptions(number);
        } catch (ArgumentPositiveException | ArgumentZeroException exception) {
            logger.log(Level.SEVERE, exception.getMessage());
        } catch (ArgumentNegativeException exception) {
            logger.log(Level.SEVERE, "Don't use negative numbers!");
        }
    }
}
