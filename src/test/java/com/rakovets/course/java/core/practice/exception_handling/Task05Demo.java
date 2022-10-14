package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ExceptionTask05;

import static com.rakovets.course.java.core.practice.exception_handling.JavaUtilLogging.logger;

public class Task05Demo {
    public static void main(String[] args) {
        String testValue = null;

        Task05 task05 = new Task05();

        try {
            task05.checkExceptionTask05(testValue);
        } catch (ExceptionTask05 exception) {
            logger.info(exception.getMessage());
        }
    }
}
