package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Logger;

public class DemoTask1 {
    public static final Logger logger = Logger.getLogger(DemoTask1.class.getName());

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        try {
            task1.getArray();
        } catch (NullPointerException e) {
            logger.info("Строка пустая");
        }
    }
}
