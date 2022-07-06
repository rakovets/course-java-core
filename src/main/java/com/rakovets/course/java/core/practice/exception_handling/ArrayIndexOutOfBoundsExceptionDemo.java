package com.rakovets.course.java.core.practice.exception_handling;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayIndexOutOfBoundsExceptionDemo {
    Logger logger = Logger.getLogger(ArrayIndexOutOfBoundsExceptionDemo.class.getName());
    ArrayIndexOutOfBoundsExceptionTask task = new ArrayIndexOutOfBoundsExceptionTask();

    public void catchArrayIndexOutOfBoundsException() {
        try {
            task.produceArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException exception) {
            logger.log(Level.SEVERE, "Array Index Out Of Bounds Exception");
        }
    }
}
