package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task07;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task07Demo {
    private static final Logger logger = Logger.getLogger(Task07Demo.class.getName());

    public static void main(String[] args) {
        Task07 task07 = new Task07();

        int firstNumber = 0;
        int secondNumber = 5;

        try {
            System.out.println(task07.division(firstNumber, secondNumber));
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.print("");
        }
    }
}
