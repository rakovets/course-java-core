package com.rakovets.course.java.core.practice.exception_handling.task01;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoStringNull {
    public static void main(String[] args) {
        StringNull stringNull = new StringNull();
        try {
            stringNull.anyMethod();
        } catch (NullPointerException ignored) {
            final Logger logger = Logger.getLogger(DemoStringNull.class.getName());
            logger.log(Level.WARNING, "You're doing something wrong");
        }
    }
}
