package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.task4.Incorrect;
import com.rakovets.course.java.core.practice.exception_handling.task4.IncorrectException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo4 {
    public static final Logger logger = Logger.getLogger(Demo4.class.getName());

    @Test
    public void testDemoIncorrectValue() {
        try {
            new Incorrect("my text").getIncorrectValue();
        } catch (IncorrectException ex) {
            logger.log(Level.WARNING, "Warning! " + ex.getMessage());
            logger.log(Level.WARNING, "StackTrace " + Arrays.toString(ex.getStackTrace()));
            logger.info("Program end");
        }
    }

    @Test
    public void testMessage() {
        Assertions.assertThrows(IncorrectException.class, () ->  new Incorrect("my text").getIncorrectValue());
    }

    @Test
    public void testCatchMessage() {
        try {
            new Incorrect("my text").getIncorrectValue();
        } catch (IncorrectException ex) {
            Assertions.assertEquals("my text", ex.getMessage());
        }
    }
}
