package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public class Task4Demo {
    public static final Logger logger = (Logger) getLogger(Task4Demo.class.getName());

    public static void main(String[] args) {
        try {
            Task4.getNullStringExceptionTask4(null);
        } catch (Exception e) {
            logger.info(e.getMessage());
            e.printStackTrace();
        }
    }
}
