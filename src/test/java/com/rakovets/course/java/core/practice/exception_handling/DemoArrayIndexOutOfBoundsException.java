package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExceptionTest arrayIndexOutOfBoundsExceptionTest = new ArrayIndexOutOfBoundsExceptionTest();
        try {
            arrayIndexOutOfBoundsExceptionTest.firstMethod(2);
        } catch (ArrayIndexOutOfBoundsException e) {
            final Logger logger = Logger.getLogger(DemoStringNull.class.getName());
            logger.log(Level.WARNING, "You're doing something wrong");
        }
    }
}
