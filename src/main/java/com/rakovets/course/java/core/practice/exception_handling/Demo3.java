package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentNegativeException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo3 {
    Logger logger = Logger.getLogger(Demo3.class.getName());
    Task3 task3 = new Task3();

    public void demoGetPositiveNumber(int number) {
        try {
            task3.getPositiveNumber(number);
        } catch (ArgumentNegativeException exception) {
            logger.log(Level.SEVERE, "Enter a positive number");
            exception.printStackTrace();
        }
    }
}
