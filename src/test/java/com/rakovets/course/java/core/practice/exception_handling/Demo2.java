package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo2 {
    public static final Logger logger = Logger.getLogger(Demo2.class.getName());

    @Test
    public void testDemoArrayIndexOutOfBoundsException() {
        try {
            new Task2().exceptionArray();
        } catch (ArrayIndexOutOfBoundsException ex) {
            logger.log(Level.SEVERE, "ERROR " + ex.getMessage());
            logger.info("Program end");
        }
    }

    @Test
    public void testArrayIndexOutOfBoundsException() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> new Task2().exceptionArray());
    }
}
