package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.task7.Task7;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo7 {
    public static final Logger logger = Logger.getLogger(Demo7.class.getName());

    public static void main(String[] args) {
        boolean isFinally = false;
        String message = "";
        Task7 task = new Task7();
        try {
            task.getException();
        } catch (Exception ex) {
            message = ex.getMessage();
        } finally {
            isFinally = true;
            logger.log(Level.WARNING, "Exception " + message);
        }
    }
}
