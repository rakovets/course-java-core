package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ExceptionTask03;

import static com.rakovets.course.java.core.practice.exception_handling.JavaUtilLogging.logger;

public class Task03Demo {
    public static void main(String[] args) {
        int testValue = 1;

        Task03 task03 = new Task03();

        try {
            task03.checkExceptionTask03(testValue);
        } catch (ExceptionTask03 exception) {
            logger.info(exception.getMessage());
        }
    }
}
