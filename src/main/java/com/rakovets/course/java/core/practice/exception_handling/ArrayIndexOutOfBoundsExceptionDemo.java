package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayIndexOutOfBoundsExceptionDemo {
    Logger logger = Logger.getLogger(ArrayIndexOutOfBoundsExceptionDemo.class.getName());
    ArrayIndexOutOfBoundsExceptionTask demo = new ArrayIndexOutOfBoundsExceptionTask();

    public void demoGetNumberInArray() {
        try {
            demo.getNumberInArray();

        } catch (ArrayIndexOutOfBoundsException exception) {
            logger.log(Level.SEVERE, "Array Index Out Of Bounds Exception");
        }
    }
}
