package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo6 {
    public static final Logger logger = Logger.getLogger(Demo6.class.getName());

    public static void main(String[] args) {
        Task6 task = new Task6();
        int index = 6;
        for (int i = 0; i < index; i++) {
            try {
                task.getException();
            } catch (NullPointerException | ArithmeticException ex) {
                logger.log(Level.WARNING, "Exception " + ex.getClass());
            } catch (RuntimeException ex) {
                logger.log(Level.SEVERE, "Exception " + ex.getClass());
            }
        }
    }
}
