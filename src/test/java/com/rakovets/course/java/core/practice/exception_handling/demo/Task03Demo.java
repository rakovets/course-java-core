package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.exception.AgeException;
import com.rakovets.course.java.core.practice.exception_handling.tasks.Task03;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task03Demo {
    private static final Logger logger = Logger.getLogger(Task03Demo.class.getName());

    public static void main(String[] args) {
        Task03 task03 = new Task03();

        int age = 17;

        try {
            System.out.println(task03.checkAge(age));
        } catch (AgeException e) {
            logger.log(Level.SEVERE, e.getMessage());
            e.printStackTrace();
        }
    }
}
