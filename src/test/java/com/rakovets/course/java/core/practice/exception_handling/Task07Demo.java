package com.rakovets.course.java.core.practice.exception_handling;

import java.io.FileNotFoundException;

import static com.rakovets.course.java.core.practice.exception_handling.JavaUtilLogging.JavaUtilLogging.logger;

public class Task07Demo {
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
