package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task01;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task01Demo {
    private static final Logger logger = Logger.getLogger(Task01Demo.class.getName());

    public static void main(String[] args) {
        Task01 task01 = new Task01();

        String firstString = null;

        try {
            assert false;
            System.out.println(task01.getStringLength(firstString));
        } catch (NullPointerException e) {
            logger.log(Level.SEVERE, "NullPointerException.");
            e.printStackTrace();
        }
    }
}
