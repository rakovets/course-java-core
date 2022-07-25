package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NpeDemo {
    private final Logger logger = Logger.getLogger(NpeDemo.class.getName());
    private final NpeTask task = new NpeTask();

    public void catchNullPointerException() {
        try {
            task.produceNullPointerException();
        } catch (NullPointerException exception) {
            logger.log(Level.SEVERE, "Null Pointer Exception");
        }
    }
}
