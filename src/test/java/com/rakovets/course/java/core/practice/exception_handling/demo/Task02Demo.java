package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task02;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task02Demo {
    private static final Logger logger = Logger.getLogger(Task02Demo.class.getName());

    public static void main(String[] args) {
        Task02 task02 = new Task02();

        int[] array = {1, 2, 4};

        int index = 4;

        try {
            System.out.println(task02.getIndexArray(index, array));
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.log(Level.SEVERE, "ArrayIndexOutOfBoundsException.");
            e.printStackTrace();
        }
    }
}
