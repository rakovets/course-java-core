package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentPositiveException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MixedExceptionsDemo {
    Logger logger = Logger.getLogger(MixedExceptionsDemo.class.getName());
    MixedExceptionsTask task = new MixedExceptionsTask();

    public void catchMixedExceptions(int number) {
        try {
            task.produceMixedExceptions(number);
        } catch (ArgumentPositiveException exception) {
            logger.log(Level.SEVERE, "It's positive number");
        } finally {
            logger.log(Level.INFO, "Finish");
        }
    }
}
