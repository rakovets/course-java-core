package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.MyArithmeticExceptionTask5;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Task5Demo {
    public static final Logger logger = Logger.getLogger(Task5Demo.class.getName());

    public static void main(String[] args) {
        Task5 task = new Task5();
        try {
            task.getArithmeticException(5, 0);
        } catch (MyArithmeticExceptionTask5 ex) {
            logger.log(Level.SEVERE, "Error " + ex.getCause());
        }
    }
}
