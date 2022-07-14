package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.exception.IncorrectValuesWhenWorkingWithAnArray;
import com.rakovets.course.java.core.practice.exception_handling.tasks.Task04;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task04Demo {
    private static final Logger logger = Logger.getLogger(Task04Demo.class.getName());

    public static void main(String[] args) {
        Task04 task04 = new Task04();

        int[] array = {10, 11, 12, 13, 14, 15};

        int index = -4;

        try {
            System.out.println(task04.getIndexArray(index, array));
        } catch (IncorrectValuesWhenWorkingWithAnArray e) {
            logger.log(Level.SEVERE, e.getMessage());
            e.printStackTrace();
        }
    }
}
