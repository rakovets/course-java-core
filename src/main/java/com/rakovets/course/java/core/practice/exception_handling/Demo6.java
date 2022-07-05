package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentNegativeException;
import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentPositiveException;
import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentZeroException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo6 {
    Logger logger = Logger.getLogger(Demo6.class.getName());
    Task6 task6 = new Task6();

    public void demoGetNumber(int number) {
        try {
            task6.getNumber(number);
        } catch (ArgumentPositiveException | ArgumentZeroException exception) {
            logger.log(Level.SEVERE, exception.getMessage());
        } catch (ArgumentNegativeException exception) {
            logger.log(Level.SEVERE, "");
        }
    }
}
