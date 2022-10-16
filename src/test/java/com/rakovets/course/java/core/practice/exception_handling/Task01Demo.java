package com.rakovets.course.java.core.practice.exception_handling;

import static com.rakovets.course.java.core.practice.exception_handling.JavaUtilLogging.JavaUtilLogging.logger;

public class Task01Demo {
    public static void main(String[] args) {
        Task01 task = new Task01();

        try {
            logger.info(String.valueOf(task.countNumberCharactersInString()));
        } catch (NullPointerException ex) {
            logger.severe("Null pointer exception!");
        }
    }
}
