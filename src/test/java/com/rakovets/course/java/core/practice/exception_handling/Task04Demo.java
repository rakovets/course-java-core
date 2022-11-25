package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ZeroCheckException;

import java.util.Arrays;
import java.util.logging.Logger;

public class Task04Demo {
    public static final Logger logger = Logger.getLogger(Task04Demo.class.getName());

    public static void main(String[] args) {
        Task04 task = new Task04();
        int dividend = 8;
        int divisor = 0;

        try {
            logger.info(String.valueOf(task.calculatorDividing(dividend, divisor)));
        } catch (ZeroCheckException ex) {
            logger.severe(ex.getMessage());
            logger.severe(Arrays.toString(ex.getStackTrace()));
        }
    }
}
