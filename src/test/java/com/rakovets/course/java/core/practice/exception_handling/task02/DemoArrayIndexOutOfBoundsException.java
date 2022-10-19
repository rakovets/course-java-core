package com.rakovets.course.java.core.practice.exception_handling.task02;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoArrayIndexOutOfBoundsException {
    static final Logger logger = Logger.getLogger(DemoArrayIndexOutOfBoundsException.class.getName());

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExceptionTest arrayIndexOutOfBoundsExceptionTest = new ArrayIndexOutOfBoundsExceptionTest();
        try {
            arrayIndexOutOfBoundsExceptionTest.firstMethod();
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.log(Level.WARNING, "You're doing something wrong");
        }
    }
}
