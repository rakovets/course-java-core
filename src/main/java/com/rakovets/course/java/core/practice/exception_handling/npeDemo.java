package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NpeDemo {
    Logger logger = Logger.getLogger(NpeDemo.class.getName());
    NpeTask task = new NpeTask();

    public void catchNullPointerException() {
        try {
            task.produceNullPointerException();
        } catch (NullPointerException exception) {
            logger.log(Level.SEVERE, "Null Pointer Exception");
        }
    }
}
