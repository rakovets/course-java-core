package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Logger;

public class DemoTask2 {
    public static final Logger logger = Logger.getLogger(DemoTask2.class.getName());

    public static void main(String[] args) {
        Task2 task = new Task2();
        try {
            task.makeArray(3);
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.info("Выход за пределы массива");
        }
    }
}
