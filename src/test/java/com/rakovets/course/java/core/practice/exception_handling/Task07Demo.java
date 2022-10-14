package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ExceptionTask07;

import static com.rakovets.course.java.core.practice.exception_handling.JavaUtilLogging.logger;

public class Task07Demo {
    public static void main(String[] args) {
        Task07 task = new Task07();

        try {
            task.checkDivider(900000, 1);
        } catch (ExceptionTask07 exception) {
            logger.info(exception.getMessage());
        } finally {
            logger.info("The method has completed its work");
        }
    }
}
