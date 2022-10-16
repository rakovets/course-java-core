package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ZeroCheckException;

import static com.rakovets.course.java.core.practice.exception_handling.JavaUtilLogging.JavaUtilLogging.logger;

public class Task04Demo {
    public static void main(String[] args) {
        Task04 task = new Task04();
        int dividend = 8;
        int divisor = 0;

        try {
            logger.info(String.valueOf(task.calculatorDividing(dividend, divisor)));
        } catch (ZeroCheckException ex) {
            ex.printStackTrace();
        }
    }
}
