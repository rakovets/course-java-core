package com.rakovets.course.java.core.practice.exception_handling.task06;


import java.util.logging.Logger;

public class DemoTask06 {
    public static final Logger logger = Logger.getLogger(DemoTask06.class.getName());

    public static void main(String[] args) {
        ThreeExceptions threeExceptions = new ThreeExceptions();
        try {
            threeExceptions.getSomeExceptions(1);
        } catch (SecurityException | IndexOutOfBoundsException e) {
            logger.info("The following exceptions are handled: SecurityException, IndexOutOfBoundsException");
        } catch (IllegalArgumentException err) {
            logger.info("The following exceptions are handled: IllegalArgumentException");
        }
    }
}
