package com.rakovets.course.java.core.practice.exception_handling;

import java.io.FileNotFoundException;
import java.util.logging.Logger;

public class Task07Demo {
    public static final Logger logger = Logger.getLogger(Task07Demo.class.getName());

    public static void main(String[] args) {
        Task07 task = new Task07();

        try {
            task.checkingFile();
        } catch (FileNotFoundException ex) {
            logger.severe(ex.getMessage());
        } catch (RuntimeException ex) {
            throw new RuntimeException(ex);
        } finally {
            logger.info("Finally block worked!");
        }
    }
}
