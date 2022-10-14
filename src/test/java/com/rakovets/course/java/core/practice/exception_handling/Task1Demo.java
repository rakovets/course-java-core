package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Logger;

public class Task1Demo {
    public static final Logger logger = Logger.getLogger(Task1Demo.class.getName());

    public static void main(String[] args) {
        Task1 task = new Task1();
        try {
            task.getUpperCaseAndTrimNull();
        } catch (NullPointerException e) {
            logger.warning("ERROR: " + e.getMessage());
            logger.info("End of program for task1");
        }
    }
}
