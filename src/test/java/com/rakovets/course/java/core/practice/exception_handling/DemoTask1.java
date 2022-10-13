package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Logger;

public class DemoTask1 {
    public static final Logger logger = Logger.getLogger(DemoTask1.class.getName());

    public static void main(String[] args) {
        try { Task1.getArray();
        } catch (RuntimeException e) {
            logger.info("Строка пустая");
        }
    }
}
