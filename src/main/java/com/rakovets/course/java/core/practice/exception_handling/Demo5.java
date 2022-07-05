package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.MyExceptionTask5;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo5 {
    Task5 task = new Task5();

    public void demoDivideNumber(int number1, int number2) {
        Logger logger = Logger.getLogger(Demo5.class.getName());
        try {
            task.divideNumber(number1, number2);
        } catch (MyExceptionTask5 exception) {
            logger.log(Level.SEVERE, "Don't divide by zero!");
        }
    }
}
