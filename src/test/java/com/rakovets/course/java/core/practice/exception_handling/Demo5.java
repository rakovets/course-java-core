package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.task5.Argument;
import com.rakovets.course.java.core.practice.exception_handling.task5.ArgumentException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo5 {
    public static final Logger logger = Logger.getLogger(Demo5.class.getName());

    @Test
    public void testDemoIllegalArgument() {
        try {
            new Argument().getIllegalArgument(0.0, 7.0);
        } catch (ArgumentException ex) {
            logger.log(Level.SEVERE, "ERROR " + ex.getCause());
        }
    }

    @Test
    public void testIllegalArgument() {
        Assertions.assertThrows(ArgumentException.class, () -> new Argument().getIllegalArgument(0.0, 7.0));
    }
}
