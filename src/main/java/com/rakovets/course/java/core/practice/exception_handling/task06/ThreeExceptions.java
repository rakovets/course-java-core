package com.rakovets.course.java.core.practice.exception_handling.task06;

import java.util.logging.Logger;

public class ThreeExceptions {
    public static final Logger logger = Logger.getLogger(ThreeExceptions.class.getName());

    public void getSomeExceptions(int digit) {
        if (digit == 1) {
            throw new IllegalArgumentException();
        } else if (digit == 2) {
            throw new IndexOutOfBoundsException();

        } else if (digit == 3) {
            throw new SecurityException();
        } else {
            logger.severe("Enter only number between 1 & 3");
        }
    }
}
