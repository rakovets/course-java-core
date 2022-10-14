package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Logger;

public class Task6Demo {
    public static final Logger logger = Logger.getLogger(Task6Demo.class.getName());

    public static void main(String[] args) {
        Task6 task = new Task6();
        try {
            task.differentExceptions(2);
        } catch (ClassCastException | ArithmeticException e) {
            logger.warning("ERROR: \"Wrong combination\"");
        } catch (NullPointerException ex) {
            logger.warning("ERROR: " + ex.getMessage());
        }
        logger.info("End of program for task6");
    }
}
