package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.task4.Calculator;

import java.util.Arrays;
import java.util.logging.Logger;

public class Task4Demo {
    public static final Logger logger = Logger.getLogger(Task4Demo.class.getName());

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 1;
        try {
            Calculator.divide(num1, num2);
        } catch (RuntimeException e){
            logger.warning("ERROR: " + e.getMessage());
            logger.warning("Stack trace: " + Arrays.toString(e.getStackTrace()));
            logger.info("End of program for task4");
        }
    }
}
