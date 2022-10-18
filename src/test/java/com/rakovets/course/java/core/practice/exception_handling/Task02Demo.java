package com.rakovets.course.java.core.practice.exception_handling;

import static com.rakovets.course.java.core.practice.exception_handling.JavaUtilLogging.logger;

public class Task02Demo {
    public static void main(String[] args) {
        Task02 task02 = new Task02();

        try {
            task02.demoArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException exception) {
            logger.info(exception.getMessage());
        }
    }
}
