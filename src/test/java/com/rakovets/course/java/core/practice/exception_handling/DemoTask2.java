package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Logger;

public class DemoTask2 {
    public static final Logger logger = Logger.getLogger(DemoTask2.class.getName());

    public static void main(String[] args) {
        int[] array = Task2.makeArray(3);
        try {
            array[4] = 4;
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.info("Выход за пределы массива");
        }
    }
}
