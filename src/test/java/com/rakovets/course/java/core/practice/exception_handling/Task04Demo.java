package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ExceptionTask04;

import java.util.Arrays;

import static com.rakovets.course.java.core.practice.exception_handling.JavaUtilLogging.logger;

public class Task04Demo {
    public static void main(String[] args) {
        String testValue = null;

        Task04 task04 = new Task04();

        try {
            task04.checkExceptionTask04(testValue);
        } catch (ExceptionTask04 exception) {
            logger.info("StackTrace: " + Arrays.toString(exception.getStackTrace()));
        }
    }
}
