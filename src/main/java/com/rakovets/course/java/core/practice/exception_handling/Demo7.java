package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentPositiveException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo7 {
    Task7 task = new Task7();

    public void demoGetPositiveNumber(int number) {
        Logger logger = Logger.getLogger(Demo7.class.getName());
        try {
            task.getPositiveNumber(number);
        } catch (ArgumentPositiveException exception) {
            logger.log(Level.SEVERE, "It's positive number");
        } finally {
            logger.log(Level.INFO, "Finish");
        }
    }
}
