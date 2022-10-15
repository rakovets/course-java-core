package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo1 {
    public static final Logger logger = Logger.getLogger(Demo1.class.getName());

    @Test
    public void testDemoTestDemoNullPointerException() {
        try {
            new Task1().getName();
        } catch (NullPointerException ex) {
            logger.log(Level.SEVERE, "ERROR " + ex.getMessage());
            logger.info("Program end");
        }
    }

    @Test
    public void testNullPointerException() {
        Assertions.assertThrows(NullPointerException.class, () -> new Task1().getName());
    }
}
