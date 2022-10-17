package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.task5.Argument;
import com.rakovets.course.java.core.practice.exception_handling.task5.ArgumentException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo5 {
    public static final Logger logger = Logger.getLogger(Demo5.class.getName());

    public static void main(String[] args) {
        try {
            new Argument().getIllegalArgument(0.0, 7.0);
        } catch (ArgumentException e) {
            logger.log(Level.SEVERE, "ERROR " + e.getMessage());
        }
    }
}
