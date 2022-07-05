package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.MyExceptionTask5;

import java.util.logging.Logger;

public class Task5 {
    Logger logger = Logger.getLogger(Task5.class.getName());

    public void divideNumber(int number1, int number2) throws MyExceptionTask5 {
        try {
            int result = number1 / number2;
        } catch (ArithmeticException exception) {
            throw new MyExceptionTask5(exception.getMessage());
        }
    }
}
