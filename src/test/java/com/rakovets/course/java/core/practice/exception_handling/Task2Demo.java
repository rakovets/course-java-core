package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Logger;

public class Task2Demo {
    public static final Logger logger = Logger.getLogger(Task2Demo.class.getName());

    public static void main(String[] args) {
        int[] array = Task2.getArray(5);
        try {
            array[8] = 4;
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.severe("Array handling error");
        }
    }
}
