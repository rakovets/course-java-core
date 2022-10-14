package com.rakovets.course.java.core.practice.exception_handling;

import static com.rakovets.course.java.core.practice.exception_handling.JavaUtilLogging.logger;

public class Task01Demo {
    public static void main(String[] args) {
        Task01 task01 = new Task01();

        try {
            task01.stringNullDeclaration();
        } catch (NullPointerException exception) {
            logger.info(exception.getMessage());
        }
    }
}
