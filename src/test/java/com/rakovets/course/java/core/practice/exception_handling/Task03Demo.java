package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.LongCheckUserNameException;

import static com.rakovets.course.java.core.practice.exception_handling.JavaUtilLogging.JavaUtilLogging.logger;

public class Task03Demo {
    public static void main(String[] args) {
        Task03 task = new Task03();
        String userName = "Us";

        try {
            task.longCheckUserName(userName);
            logger.info(userName);
        } catch (LongCheckUserNameException ex) {
            logger.severe(ex.getMessage());
        }
    }
}
