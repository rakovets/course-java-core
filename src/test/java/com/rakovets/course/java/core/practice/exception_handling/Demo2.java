package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo2 {
    public static final Logger logger = Logger.getLogger(Demo2.class.getName());

    public static void main(String[] args) {
        try {
            new Task2().exceptionArray();
        } catch (ArrayIndexOutOfBoundsException ex) {
            logger.log(Level.SEVERE, "ERROR " + ex.getMessage());
            logger.info("Program end");
        }
    }
}
