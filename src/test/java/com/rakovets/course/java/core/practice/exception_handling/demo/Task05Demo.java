package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task05;
import com.rakovets.course.java.core.practice.exception_handling.exception.IncorrectValuesWhenWorkingWithAnArrayException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task05Demo {
    private static final Logger logger = Logger.getLogger(Task05Demo.class.getName());

    public static void main(String[] args) {
        Task05 task05 = new Task05();

        int index = 5;
        int number = -4;

        try {
            System.out.println(task05.getIndexArray(index, number));
        } catch (IncorrectValuesWhenWorkingWithAnArrayException e) {
            logger.log(Level.SEVERE, e.getMessage());
            e.printStackTrace();
        }

    }
}
