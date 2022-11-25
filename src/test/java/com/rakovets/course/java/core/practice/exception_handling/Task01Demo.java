package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Logger;

public class Task01Demo {
    public static final Logger logger = Logger.getLogger(Task01Demo.class.getName());

    public static void main(String[] args) {
        Task01 task = new Task01();

        try {
            logger.info(String.valueOf(task.countNumberCharactersInString()));
        } catch (NullPointerException ex) {
            logger.severe("Null pointer exception!");
        }
    }
}
