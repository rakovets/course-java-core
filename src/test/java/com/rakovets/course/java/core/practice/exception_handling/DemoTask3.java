package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Logger;

public class DemoTask3 {
    public static final Logger logger = Logger.getLogger(DemoTask3.class.getName());

    public static void main(String[] args) {
        try {
            int sumNumbers = Task3.getSumNumbers(-10);
        } catch (SumNumbersException e) {
            logger.info(e.getMessage());
        }
    }
}
